Sistema de Gerenciamento de Shopping

Visão Geral
Este projeto, desenvolvido em Java como parte do desafio do Laboratório I na Unisinos (06/2025), implementa um sistema completo de gerenciamento de shopping center. Ele modela as operações de um shopping, incluindo lojas, produtos, endereços e datas, em quatro etapas distintas. A solução utiliza princípios de programação orientada a objetos (POO) para criar uma aplicação robusta, escalável e testável, passando com sucesso em todos os quatro validadores fornecidos, sem erros.

---

Objetivos do Projeto
Projetar e implementar classes para representar entidades de um shopping.

Estabelecer associações entre classes para modelar relações de dados realistas.

Utilizar herança e polimorfismo para modelar tipos especializados de lojas.

Gerenciar arrays para estoque de produtos e coleções de lojas.

Validar a funcionalidade por meio de suítes de teste automatizadas (ValidadorEtapa1.java a ValidadorEtapa4.java).

---

Funcionalidades e Etapas
Etapa 1: Criação de Classes
Classes Implementadas:

Endereco: Representa um endereço com atributos como nome da rua, cidade, estado, país, CEP, número e complemento. Inclui getters, setters e método toString.

Data: Modela uma data com dia, mês e ano, com validação (ex.: verificação de ano bissexto via verificaAnoBissexto), getters, setters e toString formatado (dd/mm/aaaa).

Produto: Define um produto com nome e preço, incluindo getters, setters e toString.

Loja: Representa uma loja com nome, quantidade de funcionários e salário base. Inclui dois construtores (um define o salário como -1), getters, setters, toString, gastosComSalario (calcula o custo total de salários) e tamanhoDaLoja (retorna 'P', 'M' ou 'G' com base no número de funcionários: <10, 10-30, >30).

---

Etapa 2: Associações de Classes
Melhorias Implementadas:

Adicionado endereco (tipo Endereco) e dataFundacao (tipo Data) à classe Loja, com construtores atualizados, getters, setters e toString ajustado.

Adicionado dataValidade (tipo Data) à classe Produto, com novo construtor, getters, setters e toString atualizado.

Implementado estaVencido em Produto para verificar se um produto está vencido, comparando a data de validade com uma data fornecida.

---

Etapa 3: Herança e Polimorfismo
Subclasses de Loja:

Cosmetico: Adiciona taxaComercializacao (double) para rastrear custos adicionais.

Vestuario: Inclui produtosImportados (boolean) para indicar se os produtos são importados.

Bijuteria: Apresenta metaVendas (double) para metas de vendas.

Alimentacao: Adiciona dataAlvara (tipo Data) para rastrear a data do alvará.

Informatica: Inclui seguroEletronicos (double) para custos de seguro de eletrônicos.

Implementação:
Cada subclasse possui construtor, getters, setters e método toString sobrescrito para incluir o atributo específico, aproveitando a herança de Loja.

---

Etapa 4: Arrays e Gerenciamento do Shopping
Atualizações em Loja:

Adicionado estoqueProdutos (array de Produto) para gerenciar o estoque, inicializado nos construtores com uma capacidade especificada.

Implementado imprimeProdutos para exibir produtos não nulos, insereProduto para adicionar um produto na primeira posição vazia (retorna true se bem-sucedido) e removeProduto para remover um produto pelo nome (retorna true se encontrado).

Atualizado toString para incluir o tamanho do estoque.

Classe Shopping:

Atributos: nome (String), endereco (Endereco) e lojas (array de Loja).

Construtor: Inicializa o array lojas com uma capacidade definida.

Métodos:

Getters e setters para todos os atributos.

insereLoja: Adiciona uma loja na primeira posição vazia, retorna true se bem-sucedido.

removeLoja: Remove uma loja pelo nome, retorna true se encontrada.

quantidadeLojasPorTipo: Conta lojas de um tipo específico (ex.: "Cosmético", "Vestuário") usando instanceof, retorna -1 para tipos inválidos.

lojaSeguroMaisCaro: Encontra a loja Informatica com o maior custo de seguro de eletrônicos, retorna null se não houver.

toString: Fornece um resumo do shopping.

---

Detalhes Técnicos
Linguagem: Java

Princípios de POO: Encapsulamento (atributos privados, métodos públicos), herança (subclasses de lojas especializadas), polimorfismo (via instanceof em Shopping) e abstração.

Métodos Principais:

Loja.insereProduto: Gerencia o estoque de produtos com inserção baseada em array.

Loja.removeProduto: Remove produtos pelo nome, mantendo a integridade do array.

Shopping.quantidadeLojasPorTipo: Usa polimorfismo para contar tipos de lojas dinamicamente.

Shopping.lojaSeguroMaisCaro: Compara custos de seguro para lojas Informatica.

Validação:
Testado contra quatro classes validadoras (ValidadorEtapa1.java a ValidadorEtapa4.java), alcançando 100% de resultados [OK] sem erros de compilação ou execução.

Tratamento de Erros:
Validação de data em Data define 1/1/2000 para entradas inválidas; métodos de array lidam corretamente com estados cheio/vazio.

---

Processo de Desenvolvimento
Design: Estruturei as classes para atender aos requisitos de cada etapa, começando com atributos e métodos básicos, expandindo para associações, herança e gerenciamento de arrays.

Depuração: Corrigi problemas iniciais com construtores de Loja e valores padrão para alinhar com ValidadorEtapa1.java, garantindo compatibilidade em todas as etapas.

Testes: Compilei e executei cada validador (javac *.java, depois java ValidadorEtapaX) para confirmar a funcionalidade, iterando sobre correções para assinaturas de construtores, saídas de métodos e manipulação de arrays.

Apresentação: Criei um screencast de 4 minutos para exibir a pasta do projeto, destacar métodos principais (ex.: insereProduto, quantidadeLojasPorTipo) e demonstrar a execução bem-sucedida de ValidadorEtapa4.java.

---

Arquivos
Classes Principais:

Endereco.java

Data.java

Produto.java

Loja.java

Cosmetico.java

Vestuario.java

Bijuteria.java

Alimentacao.java

Informatica.java

Shopping.java

Validadores (Fornecidos para Testes):

ValidadorEtapa1.java

ValidadorEtapa2.java

ValidadorEtapa3.java

ValidadorEtapa4.java

Submissão:
Empacotado em um arquivo .zip (GR96002-01-NomeCompleto.zip) para entrega.

---

Habilidades Demonstradas
Programação: Proficiência em Java, implementando lógica complexa e estruturas de dados.

POO: Aplicação eficaz de encapsulamento, herança, polimorfismo e abstração.

Resolução de Problemas: Depuração de problemas em construtores e métodos para atender a testes rigorosos.

Testes: Garantia de confiabilidade por meio de suítes de teste automatizadas.

Comunicação: Apresentação do projeto via screencast, explicando código e resultados com clareza.

---


Lições Aprendidas
Dominei o desenvolvimento progressivo em várias etapas, equilibrando compatibilidade retroativa.

Ganhei experiência em gerenciamento de arrays e comportamento polimórfico em Java.

Aprimorei habilidades de depuração alinhando o código às expectativas dos validadores.

Melhorei a capacidade de documentar e apresentar projetos técnicos de forma eficaz.

---

Melhorias Futuras
Adicionar uma interface gráfica para visualizar o shopping e o estoque.

Implementar entrada/saída de arquivos para salvar e carregar dados de lojas e produtos.

Expandir a validação com casos extremos (ex.: preços negativos, datas inválidas).

