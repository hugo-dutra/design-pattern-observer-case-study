package services.implementations;

import models.Asset;
import observers.implementations.StockBrokerImpl;
import services.interfaces.StockExchangePresenter;
import java.util.Scanner;
import java.util.List;

public class StockExchangePresenterImpl implements StockExchangePresenter {
    private StockExchangeAdminImpl stockExchangeAdminImpl;

    @Override
    public void displayStockExchange(List<Asset> listOfAssets) {
        System.out.println("-----------------------------------------------------");
        System.out.println("| Asset Name  | Current Value | Value Variation (%) |");
        System.out.println("-----------------------------------------------------");

        for (Asset asset : listOfAssets) {
            float currentValue = asset.getCurrentValue();
            String assetName = asset.getAssetName();
            float valueVariation = asset.getCurrentValueVariation();

            System.out.printf("| %-12s| %-14.2f| %-19.2f|%n", assetName, currentValue, valueVariation);
        }
        System.out.println("-----------------------------------------------------");
    }

    public StockExchangePresenterImpl(StockExchangeAdminImpl stockExchangeAdminImpl) {
        this.stockExchangeAdminImpl = stockExchangeAdminImpl;
    }

    @Override
    public void displayNegociationOptions() {
        Scanner scanner = new Scanner(System.in);
        String assetChoice;
        float price;

        System.out.println("O que você gostaria de fazer?");
        System.out.println("1. Adicionar um asset");
        System.out.println("2. Remover um asset");
        System.out.println("3. Atualizar um asset");
        System.out.println("4. Adicionar um broker");
        System.out.println("5. Remover um broker");
        System.out.println("6. Atualizar um broker");

        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Defina o ativo:");
                assetChoice = scanner.next();
                System.out.println("Informe o preço:");
                price = scanner.nextFloat();
                stockExchangeAdminImpl.addAsset(new Asset(price, assetChoice));
                break;
            case 2:
                System.out.println("Defina o ativo:");
                assetChoice = scanner.next();
                System.out.println("Informe o preço:");
                price = scanner.nextFloat();
                stockExchangeAdminImpl.removeAsset(new Asset(price, assetChoice));
                break;
            case 3:
                System.out.println("Defina o ativo:");
                assetChoice = scanner.next();
                System.out.println("Informe o preço:");
                price = scanner.nextFloat();
                stockExchangeAdminImpl.updateAsset(new Asset(price, assetChoice));
                break;
            case 4:
                // Adicionar um broker
                System.out.println("Informe o nome do broker:");
                String brokerName = scanner.next();

                System.out.println("Informe o limiar de compra baixo:");
                float buyLow = scanner.nextFloat();

                System.out.println("Informe o limiar de compra alto:");
                float buyHigh = scanner.nextFloat();

                System.out.println("Informe o limiar de venda baixo:");
                float sellLow = scanner.nextFloat();

                System.out.println("Informe o limiar de venda alto:");
                float sellHigh = scanner.nextFloat();

                StockBrokerImpl newBroker = new StockBrokerImpl.StockBrokerBuilder()
                        .withBrokerName(brokerName)
                        .withBuyThresholdLow(buyLow)
                        .withBuyThresholdHigh(buyHigh)
                        .withSellThresholdLow(sellLow)
                        .withSellThresholdHigh(sellHigh)
                        .build();
                stockExchangeAdminImpl.getStockExchange().addStockBroker(newBroker);
                break;
            case 5:
                System.out.println("Informe o nome do broker:");
                brokerName = scanner.next();
                stockExchangeAdminImpl.getStockExchange().removeStockBrokerByName(brokerName);
                break;
            case 6:
                System.out.println("Informe o nome do broker:");
                brokerName = scanner.next();
                stockExchangeAdminImpl.getStockExchange().updateStockBrokerByName(brokerName);
                break;
            default:
                System.out.println("Opção inválida.");
                break;
        }
    }

}
