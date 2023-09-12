# 📈 Sistema de Negociação de Ativos com Padrão Observer

Este projeto simula um sistema de negociação de ativos (como ações, criptomoedas, commodities, etc.) usando o padrão de design Observer. O sistema é composto por diferentes componentes que reagem às mudanças nos preços dos ativos.

## 📌 Componentes

1. **Exchange (Bolsa de Valores)**: Mantém e atualiza os preços dos ativos.
2. **Trader Bot**: Executa operações de compra e venda com base nas mudanças de preço.
3. **Painel de Dashboard**: Exibe informações em tempo real sobre os preços dos ativos.
4. **Sistema de Alerta**: Envia notificações quando certos limites de preço são atingidos.
5. **Regulador Financeiro**: Mantém registros de todas as mudanças de preço para auditoria.

## ⚙️ Funcionalidades

- Adicionar, remover e atualizar preços de ativos na Bolsa de Valores.
- Estratégias de negociação diversas no Trader Bot.
- Atualização em tempo real do Painel de Dashboard.
- Envio de alertas pelo Sistema de Alerta.
- Registro persistente de atividades pelo Regulador Financeiro.

## 🛠️ Requisitos Técnicos

- Java 8 ou superior
- (Opcional) Banco de dados para armazenamento persistente

## 🚀 Como Executar

1. Clone este repositório
2. Compile o projeto
3. Execute a classe `Main`

## 🗂️ Estrutura do Projeto

- `src/observable/financial/`: Contém todas as classes e interfaces relacionadas ao padrão Observer.
- `src/utils/`: Contém utilitários e constantes.
- `src/Main.java`: Classe principal que inicializa e executa o sistema.

## 🤝 Contribuições

Contribuições são bem-vindas! Sinta-se à vontade para abrir uma issue ou enviar um pull request.

## 📜 Licença

Este projeto está licenciado sob a licença MIT.
