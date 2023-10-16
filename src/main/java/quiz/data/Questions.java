package quiz.data;

import quiz.models.Question;

import java.util.ArrayList;
import java.util.List;

public class Questions {
    private static final List<Question> questions = new ArrayList<>();

    public static List<Question> listOfQuestions(){
        addGeographyQuestions();
        addGeneralKnowledgeQuestions();
        addTriviaQuestions();

        return questions;
    }

    private static void addGeographyQuestions() {
        addQuestion("Qual é a capital do Brasil?", new String[] {"Brasília", "Rio de Janeiro", "São Paulo", "Salvador"}, "Brasília", "Geografia");
        addQuestion("Qual é o maior continente?", new String[] {"Ásia", "América", "África", "Europa"}, "Ásia", "Geografia");
        addQuestion("Qual é o rio mais longo do mundo?", new String[] {"Amazonas", "Nilo", "Mississippi", "Yangtzé"}, "Amazonas", "Geografia");
        addQuestion("Qual é a montanha mais alta do mundo?", new String[] {"Everest", "K2", "Annapurna", "Kilimanjaro"}, "Everest", "Geografia");
        addQuestion("Qual é o deserto mais seco do mundo?", new String[] {"Saara", "Atacama", "Kalahari", "Gobi"}, "Atacama", "Geografia");
        addQuestion("Qual é o país mais populoso do mundo?", new String[] {"China", "Índia", "Estados Unidos", "Brasil"}, "China", "Geografia");
        addQuestion("Qual o oceano mais profundo?", new String[] {"Atlântico", "Pacífico", "Índico", "Ártico"}, "Pacífico", "Geografia");
        addQuestion("Qual é a capital da Austrália?", new String[] {"Sydney", "Melbourne", "Canberra", "Brisbane"}, "Canberra", "Geografia");
        addQuestion("Qual é o país com mais ilhas?", new String[] {"Filipinas", "Indonésia", "Japão", "Grécia"}, "Indonésia", "Geografia");
        addQuestion("Em que continente fica o Egito?", new String[] {"Ásia", "África", "Europa", "América"}, "África", "Geografia");
        addQuestion("Qual é o menor país do mundo?", new String[] {"Vaticano", "Mônaco", "Nauru", "San Marino"}, "Vaticano", "Geografia");
        addQuestion("Qual é a capital da Alemanha?", new String[] {"Berlim", "Munique", "Hamburgo", "Frankfurt"}, "Berlim", "Geografia");
        addQuestion("Qual é o lago mais profundo do mundo?", new String[] {"Lago Baikal", "Lago Victoria", "Lago Superior", "Mar Cáspio"}, "Lago Baikal", "Geografia");
        addQuestion("Qual é o país mais frio do mundo?", new String[] {"Canadá", "Rússia", "Antártica", "Groenlândia"}, "Antártica", "Geografia");
        addQuestion("Onde fica a Floresta Amazônica?", new String[] {"Brasil", "Colômbia", "Venezuela", "Todas as anteriores"}, "Todas as anteriores", "Geografia");
        addQuestion("Qual é a capital da Suíça?", new String[] {"Zurique", "Genebra", "Basel", "Berna"}, "Berna", "Geografia");
        addQuestion("Qual é o idioma mais falado no mundo?", new String[] {"Inglês", "Mandarim", "Espanhol", "Hindi"}, "Mandarim", "Geografia");
        addQuestion("Qual é o país mais rico do mundo?", new String[] {"Qatar", "Luxemburgo", "Singapura", "Noruega"}, "Qatar", "Geografia");
        addQuestion("Qual é o canal mais curto entre o Oceano Atlântico e o Pacífico?", new String[] {"Canal do Panamá", "Canal de Suez", "Estreito de Magalhães", "Canal de Kiel"}, "Canal do Panamá", "Geografia");
        addQuestion("Qual é a capital da Noruega?", new String[] {"Estocolmo", "Copenhague", "Helsinque", "Oslo"}, "Oslo", "Geografia");
    }

    private static void addGeneralKnowledgeQuestions() {
        addQuestion("Quem escreveu 'Dom Casmurro'?", new String[] {"Machado de Assis", "Carlos Drummond de Andrade", "Jorge Amado", "Clarice Lispector"}, "Machado de Assis", "Conhecimentos Gerais");
        addQuestion("O que é H2O?", new String[] {"Água", "Oxigênio", "Hélio", "Metano"}, "Água", "Conhecimentos Gerais");
        addQuestion("Quem pintou a Mona Lisa?", new String[] {"Leonardo da Vinci", "Michelangelo", "Rafael", "Donatello"}, "Leonardo da Vinci", "Conhecimentos Gerais");
        addQuestion("Quem é o autor de 'Romeu e Julieta'?", new String[] {"William Shakespeare", "Charles Dickens", "J.K. Rowling", "George Orwell"}, "William Shakespeare", "Conhecimentos Gerais");
        addQuestion("Qual é o planeta mais próximo do Sol?", new String[] {"Vênus", "Terra", "Marte", "Mercúrio"}, "Mercúrio", "Conhecimentos Gerais");
        addQuestion("Quem é o fundador da Microsoft?", new String[] {"Bill Gates", "Steve Jobs", "Mark Zuckerberg", "Elon Musk"}, "Bill Gates", "Conhecimentos Gerais");
        addQuestion("O que significa 'HTTP'?", new String[] {"HyperText Transfer Protocol", "High-Tech Telecommunications Product", "Hyper Transfer Text Protocol", "Huge Transfers Through Port"}, "HyperText Transfer Protocol", "Conhecimentos Gerais");
        addQuestion("Qual é a fórmula química da cafeína?", new String[] {"C₈H₁₀N₄O₂", "C₆H₁₂O₆", "H₂SO₄", "NaCl"}, "C₈H₁₀N₄O₂", "Conhecimentos Gerais");
        addQuestion("O que é um byte?", new String[] {"8 bits", "16 bits", "32 bits", "64 bits"}, "8 bits", "Conhecimentos Gerais");
        addQuestion("Qual é o maior planeta do Sistema Solar?", new String[] {"Júpiter", "Saturno", "Urano", "Netuno"}, "Júpiter", "Conhecimentos Gerais");
        addQuestion("Quem é o criador do Linux?", new String[] {"Linus Torvalds", "Richard Stallman", "Steve Wozniak", "Tim Berners-Lee"}, "Linus Torvalds", "Conhecimentos Gerais");
        addQuestion("O que é DNS?", new String[] {"Domain Name System", "Data Network Service", "Dynamic Name Server", "Direct Network Setup"}, "Domain Name System", "Conhecimentos Gerais");
        addQuestion("Qual é o idioma mais antigo em uso contínuo?", new String[] {"Sânscrito", "Latim", "Tâmil", "Grego"}, "Tâmil", "Conhecimentos Gerais");
        addQuestion("Quem é conhecido como o Pai da Computação?", new String[] {"Alan Turing", "John von Neumann", "Ada Lovelace", "Bill Gates"}, "Alan Turing", "Conhecimentos Gerais");
        addQuestion("Qual é a unidade básica da vida?", new String[] {"Átomo", "Molécula", "Célula", "Orgão"}, "Célula", "Conhecimentos Gerais");
        addQuestion("Em que ano a Internet foi inventada?", new String[] {"1969", "1971", "1980", "1995"}, "1969", "Conhecimentos Gerais");
        addQuestion("Quem foi o primeiro homem a andar na Lua?", new String[] {"Neil Armstrong", "Buzz Aldrin", "Yuri Gagarin", "John Glenn"}, "Neil Armstrong", "Conhecimentos Gerais");
        addQuestion("Quem é o autor de 'O Senhor dos Anéis'?", new String[] {"J.R.R. Tolkien", "J.K. Rowling", "George R.R. Martin", "C.S. Lewis"}, "J.R.R. Tolkien", "Conhecimentos Gerais");
        addQuestion("Qual é o elemento químico mais abundante no Universo?", new String[] {"Oxigênio", "Carbono", "Hidrogênio", "Ferro"}, "Hidrogênio", "Conhecimentos Gerais");
        addQuestion("Em que ano foi assinada a Declaração de Independência dos Estados Unidos?", new String[] {"1776", "1783", "1804", "1812"}, "1776", "Conhecimentos Gerais");
    }

    private static void addTriviaQuestions() {
        addQuestion("Qual é o animal mais rápido?", new String[] {"Guepardo", "Águia", "Tubarão", "Leão"}, "Guepardo", "Curiosidades");
        addQuestion("Em que ano a Bitcoin foi criada?", new String[] {"2005", "2008", "2010", "2012"}, "2008", "Curiosidades");
        addQuestion("Qual é o elemento químico com o símbolo 'Au'?", new String[] {"Ouro", "Prata", "Cobre", "Alumínio"}, "Ouro", "Curiosidades");
        addQuestion("O que é um polígono com sete lados?", new String[] {"Hexágono", "Pentágono", "Heptágono", "Octógono"}, "Heptágono", "Curiosidades");
        addQuestion("Qual é a moeda do Japão?", new String[] {"Dólar", "Euro", "Iene", "Libra"}, "Iene", "Curiosidades");
        addQuestion("Qual é o idioma mais falado no mundo?", new String[] {"Inglês", "Mandarim", "Espanhol", "Árabe"}, "Mandarim", "Curiosidades");
        addQuestion("Qual é o videogame mais vendido de todos os tempos?", new String[] {"Minecraft", "Tetris", "Grand Theft Auto V", "Wii Sports"}, "Minecraft", "Curiosidades");
        addQuestion("Qual foi o primeiro planeta a ser descoberto usando um telescópio?", new String[] {"Urano", "Netuno", "Marte", "Vênus"}, "Urano", "Curiosidades");
        addQuestion("O que é Sudoku?", new String[] {"Um jogo de tabuleiro", "Um prato de comida", "Um tipo de dança", "Um esporte"}, "Um jogo de tabuleiro", "Curiosidades");
        addQuestion("Qual é o maior osso do corpo humano?", new String[] {"Fêmur", "Crânio", "Coluna Vertebral", "Úmero"}, "Fêmur", "Curiosidades");
        addQuestion("O que é pi?", new String[] {"Uma constante matemática", "Uma unidade de medida", "Um tipo de gráfico", "Uma marca de carro"}, "Uma constante matemática", "Curiosidades");
        addQuestion("Qual é a flor nacional do Japão?", new String[] {"Rosa", "Tulipa", "Cerejeira", "Lírio"}, "Cerejeira", "Curiosidades");
        addQuestion("O que é uma gárgula?", new String[] {"Uma estátua de pedra", "Uma planta venenosa", "Um tipo de arma", "Um animal extinto"}, "Uma estátua de pedra", "Curiosidades");
        addQuestion("O que significa 'www'?", new String[] {"World Wide Web", "Wild Wild West", "World Wide Wagon", "Wild World Web"}, "World Wide Web", "Curiosidades");
        addQuestion("O que é um drone?", new String[] {"Um tipo de robô", "Uma ferramenta de jardinagem", "Um instrumento musical", "Um tipo de comida"}, "Um tipo de robô", "Curiosidades");
        addQuestion("Qual é o idioma oficial do Brasil?", new String[] {"Português", "Espanhol", "Inglês", "Francês"}, "Português", "Curiosidades");
        addQuestion("Em que ano ocorreu o acidente nuclear de Chernobyl?", new String[] {"1979", "1984", "1986", "1991"}, "1986", "Curiosidades");
        addQuestion("Quem é o personagem principal de 'O Poderoso Chefão'?", new String[] {"Michael Corleone", "Tony Montana", "Vito Corleone", "Henry Hill"}, "Michael Corleone", "Curiosidades");
        addQuestion("Quem é o deus do trovão na mitologia nórdica?", new String[] {"Zeus", "Thor", "Odin", "Hércules"}, "Thor", "Curiosidades");
        addQuestion("Qual é a capital da Austrália?", new String[] {"Sydney", "Melbourne", "Brisbane", "Canberra"}, "Canberra", "Curiosidades");
    }

    private static void addQuestion(String questionText, String[] choices, String answer, String category) {
        Question question = new Question();
        question.question = questionText;
        question.choices = choices;
        question.answer = answer;
        questions.add(question);
    }
}
