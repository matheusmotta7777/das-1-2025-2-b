
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

