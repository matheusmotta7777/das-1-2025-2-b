
<!-- Aula 1 - 31/07 -->

Abstrações
Converter problemas do mundo real em soluções técnicas é uma das principais funções da abstração. Ela permite representar conceitos complexos de forma mais simples e compreensível no desenvolvimento de software.

API
As APIs atuam como uma camada de abstração entre o front-end e o back-end, encapsulando funcionalidades e expondo apenas o necessário para a comunicação entre sistemas.

Complexidade
Assim como na vida, a complexidade é inevitável no desenvolvimento de software. Problemas que antes eram resolvidos com poucas linhas de código hoje exigem uma estruturação mais robusta, com uso de classes e boas práticas. Enfrentar essas complexidades é parte essencial do crescimento profissional.

Framework
Os frameworks auxiliam no desenvolvimento ao simplificar tarefas complexas e padronizar processos, muitas vezes reduzindo grandes blocos de código a algumas linhas. Escolher o framework adequado é crucial para o sucesso de um projeto.
Para quem está estudando, dominar pelo menos um framework é fundamental, pois a lógica entre eles costuma ser parecida, o que facilita a adaptação a outros.

Estrutura de Dados
A escolha adequada da estrutura de dados é essencial para a eficiência de sistemas, especialmente em projetos complexos. Grandes empresas valorizam muito esse conhecimento, pois ele impacta diretamente no desempenho e organização do software.

Information Hiding (Ocultamento de Informação)
Esse conceito trata de esconder detalhes internos da implementação, expondo apenas o necessário. Isso simplifica o uso de sistemas, permitindo que usuários ou desenvolvedores utilizem funcionalidades sem precisar entender toda a lógica por trás.



<!-- Aula 2 - 04/08 -->

COESÃO:

A implementação de qualquer classe deve ser coesa, isto é, toda classe deve implementar uma única funcionalidade ou serviço. Especificamente, todos os métodos e atributos de uma classe devem estar voltados para a implementação do mesmo serviço. Uma outra forma de explicar coesão é afirmando que toda classe deve ter uma única responsabilidade no sistema. Ou, ainda, afirmando que deve existir um único motivo para modificar uma classe.

Coesão tem as seguintes vantagens:

Facilita a implementação de uma classe, bem como o seu entendimento e manutenção.

Facilita a alocação de um único responsável por manter uma classe.

Facilita o reúso e teste de uma classe, pois é mais simples reusar e testar uma classe coesa do que uma classe com várias responsabilidades.

No contexto da engenharia de software, o acoplamento refere-se ao grau de dependência entre módulos de um sistema. Um sistema com baixo acoplamento tende a ser mais modular, flexível e de fácil manutenção, pois mudanças em um componente têm impacto mínimo sobre os demais. Em contrapartida, alto acoplamento compromete a escalabilidade, reutilização e testabilidade do software.

Para mitigar problemas relacionados ao acoplamento excessivo e promover um design de software mais robusto e sustentável, destacam-se os princípios SOLID, um conjunto de boas práticas da programação orientada a objetos. Esses princípios são:

Single Responsibility Principle (SRP): cada classe deve ter uma única responsabilidade, promovendo alta coesão.

Open/Closed Principle (OCP): sistemas devem ser abertos para extensão, mas fechados para modificação, facilitando a evolução sem comprometer funcionalidades existentes.

Liskov Substitution Principle (LSP): subclasses devem ser substituíveis por suas superclasses sem alterar o comportamento do sistema.

Interface Segregation Principle (ISP): interfaces devem ser específicas e não forçar o uso de métodos desnecessários pelos clientes.

Dependency Inversion Principle (DIP): módulos de alto nível não devem depender de módulos de baixo nível, mas sim de abstrações, promovendo a inversão de dependências.

A aplicação dos princípios SOLID contribui significativamente para a construção de sistemas com alta coesão e baixo acoplamento, características essenciais para a manutenção, evolução e escalabilidade de projetos de software.

<!-- Aula 3 - 07/08 -->

S ingle responsability Principie
O pen/close principie
L iskow substitution principie
I nterface segregation principie
D ependency inversion principie

1- Princípio da Responsabilidade Única

Esse princípio é uma aplicação direta da ideia de coesão

Entity <-- Dados
Repository <-- JPA spring data
Services <-- Lógica(use cases)
Controller <-- Api rest

Seta de Herança - Seta com ponta vazada (aberta) e linha contínua
Seta de Variável - Seta com ponta fechada e linha contínua
Seta de Interface - Seta com ponta vazada (aberta) e linha tracejada
Seta de Associação - Seta com ponta fechada e linha tracejada

quando criamos uma interface, ela deve ser específica para um propósito, e não obrigar as classes que a implementam a fornecer métodos inúteis para elas.

Benefícios
Flexibilidade — cada tipo implementa só o que precisa.

Manutenção mais fácil — mudanças numa interface afetam menos classes.

Menos código morto — não há métodos vazios só “para cumprir contrato”.

<!-- Aula 4 - 11/08 -->

Aula 11/08
Princípio de Inversão de Dependências

Esse princípio recomenda que uma classe cliente deve estabelecer dependências pioritariamente com abstrações e com implementações concretas

Os controladores precisam de uma dependência, no caso, interfaces de serviço e não com a implementação concreta, ou seja, service impl

O cliente não "conversa" diretamente com o código, ele aguarda em uma interface pela resposta do código

Prefira Composição a Herança

Existem dois tipos de herança:

Herança de classes: envolve reúso de código (deve ser evitada).

Herança de interfaces: Permite que uma interface herde de outras interfaces, estabelecendo um conjunto de métodos que devem ser implementados por classes que implementam a interface derivada

Ao invés de se utilizar heranças o ideal é se utilizar associações, heranças tendem a introduzir problemas na manutenão e evolução de classes de um sistema.

Heranças só podem ser utilizada se as subclasses nunca irão se juntar, exemplo um "gato" não pode ser um "cachorro" portanto pode se utilizar heranças.

Princípio de Demeter ou Menor Conhecimento

Um método deve invocar somentes os seguintes outros métodos:

1- de sua própria classe 2- de objetos passados como parâmetros 3- de objetos criados pelo próprio métodos 4- de atributos da classe do método

Princípio Aberto/Fechado

Uma classe deve estar fechada para modificações e aberta para extensões

<!-- Aula 5 - 14/08 -->

Princípio de Substituição de Liskov (LSP) 
    Herança define uma relação *é-um* entre objetos de uma classe base e objetos de subclasses.  
  Quando se tem uma herança, subclasses precisam dos mesmos métodos que o pai.
    Substitui um filho por outro, sem ter perda.

<!-- Aula 6 - 18/08 -->

O que é um método estático?
    É um método que é carregado na memória antes de qualquer coisa




