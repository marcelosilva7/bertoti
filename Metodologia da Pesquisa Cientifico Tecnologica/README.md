<h1>Metodologia da Pesquisa Científico Tecnológica</h1>

<h2>DESCRIÇÃO DO PROJETO</h2>
<p>O foco deste projeto é desenvolver uma aplicação web destinada ao gerenciamento eficiente de vendas, abordando três aspectos fundamentais: o histórico de vendas dos vendedores, o planejamento de vendas e o registro das vendas realizadas.</p>
<p>A funcionalidade central da aplicação reside em sua habilidade de comparar e analisar esses três conjuntos de dados de maneira detalhada e precisa. Isso possibilita uma avaliação aprofundada dos resultados das vendas, considerando tanto o histórico dos vendedores quanto os planos de vendas previamente estabelecidos.</p>
<p>Um elemento inovador do projeto é a integração de um algoritmo preexistente de Inteligência Artificial. Esse algoritmo será utilizado para gerar previsões e insights valiosos, visando aumentar a precisão e confiabilidade das análises realizadas pela aplicação.</p>
<p>Em suma, o desafio do projeto é criar uma aplicação web que não só simplifique o gerenciamento de vendas, mas também ofereça uma análise minuciosa ao comparar o histórico dos vendedores, o planejamento de vendas e os registros de vendas efetivas. Além disso, a aplicação contará com o aprimoramento de previsões baseadas em Inteligência Artificial, melhorando significativamente o processo de tomhttps://github.com/marcelosilva7/bertoti/blob/main/Metodologia%20da%20Pesquisa%20Cientifico%20Tecnologica/README.mdada de decisões relacionadas a vendas.</p>

<h2>TECNOLOGIAS UTILIZADAS</h2>
<ul>
    <li>JavaScript (Front-End)</li>
    <li>Bootstrap (Front-End)</li>
    <li>Java (Back-End)</li>
    <li>Spring Boot (Back-End)</li>
    <li>MySQL (Banco de Dados)</li>
</ul>

<h2>CONTRIBUIÇÕES PESSOAIS</h2>
<p>Na realização deste projeto, desempenhei um papel crucial no desenvolvimento do back-end, aplicando minhas habilidades técnicas e influenciando estrategicamente o progresso do sistema:</p>
<ul>
    <li><strong>Desenvolvimento de Operações de CRUD para Modelos Diversos:</strong> Liderei a implementação das operações de CRUD para modelos chave como Cliente, Vendedor e Registro. Utilizei APIs RESTful para gerenciar os dados de forma eficiente, aplicando meu conhecimento aprofundado em Spring Boot e JPA para criar soluções de back-end robustas.</li>
    <li><strong>Criação de Controladores:</strong> Fui responsável pelo desenvolvimento de controladores em Java com Spring Boot. Essa tarefa envolveu a gestão de solicitações e respostas HTTP e a integração da interface do usuário com a lógica de negócios. Essa experiência reforçou meu entendimento do fluxo de dados entre o front-end e o back-end e melhorou minha habilidade em processar e responder a dados de forma eficiente e segura.</li>
    <li><strong>Estruturação de Repositórios e Serviços:</strong> Projetar e desenvolver repositórios e serviços foi uma das minhas principais contribuições. Concentrei-me em simplificar as operações de banco de dados e encapsular a lógica de negócios, seguindo as melhores práticas de código limpo e sustentável. Isso incluiu a criação de serviços especializados para abstrair a complexidade das interações com o banco de dados, melhorando a manutenibilidade e a escalabilidade do sistema.</li>
    <li><strong>Implementação do RegistroConverter:</strong> Um dos desafios mais intricados que enfrentei foi o projeto e implementação do RegistroConverter. Esse componente foi vital na transformação de objetos de entidade em DTOs e vice-versa, assegurando uma transferência de dados eficiente e segura entre as camadas da aplicação. Esse trabalho me permitiu aprofundar meus conhecimentos sobre padrões DTO e práticas de segurança de dados.</li>
</ul>

<h2>APRENDIZADOS</h2>
<h3>Desenvolvimento de Operações de CRUD</h3>
<p>Entendimento Profundo do Spring Boot e JPA: A implementação das operações de CRUD para entidades como Cliente, Vendedor e Registro exigiu que eu aprofundasse meu conhecimento no Spring Boot e na Java Persistence API (JPA). Criei repositórios sofisticados e utilizei métodos CRUD padrão, além de operações personalizadas.</p>
<p>Modelagem de Dados e Relacionamentos: Desenvolver os modelos e estabelecer relações entre eles permitiu-me adquirir habilidades avançadas em modelagem de dados e compreender como as entidades interagem dentro do banco de dados SQL.</p>

<h3>Criação de Controladores</h3>
<p>Gestão de Solicitações HTTP: Desenvolver controladores em Java com Spring Boot permitiu-me familiarizar-me com o tratamento de solicitações HTTP, incluindo o recebimento, processamento e resposta aos dados dos usuários.</p>
<p>Integração de Front-End e Back-End: Ao criar controladores, reforcei meu entendimento de como as solicitações do Front-End são processadas no Back-End e como os dados são enviados de volta ao usuário, proporcionando uma visão completa do fluxo de dados em uma aplicação web.</p>

<h3>Estruturação de Repositórios e Serviços</h3>
<p>Abstração e Organização do Código: Aprendi a importância de manter o código organizado e modular, criando repositórios e serviços que abstraem a lógica de negócios e operações de banco de dados, seguindo as melhores práticas de desenvolvimento.</p>

<h3>Implementação do RegistroConverter</h3>
<p>Conversão e Transferência de Dados Eficiente: O desenvolvimento do RegistroConverter aprimorou meu conhecimento sobre padrões DTO (Data Transfer Object). Tornei-me habilidoso na conversão de entidades em DTOs para transferência de dados eficiente e segura entre diferentes camadas da aplicação.</p>

<details>
<summary><b>Entendendo o Conversor de Registro</b></summary>    
  <br>

<p>Vamos imaginar que a classe 'RegistroConverter' é um tipo de filtro mágico em um escritório de registros. Quando alguém pede informações sobre as vendas (isso é o que chamamos de 'fazer um get'), esse filtro transforma pilhas de papéis com detalhes técnicos em um resumo fácil de entender.</p>

![classeconverterregistro](https://github.com/marcelosilva7/bertoti/assets/101959064/67ccf6f3-7432-40db-8c71-ece447fcc383)

<h2>Como o Conversor Trabalha:</h2>
<ul>
    <li><strong>@Component:</strong> Essa é a etiqueta que diz que nosso filtro é uma ferramenta que pode ser usada no escritório a qualquer momento.</li>
    <li><strong>public class RegistroConverter:</strong> É o nome do nosso filtro mágico.</li>
    <li><strong>public List<RegistroGetRequestDto> convert(...):</strong> Essa é a instrução que diz o que o filtro deve fazer: ele pega uma lista de registros detalhados e os transforma em uma lista de resumos.</li>
    <li><strong>final List<RegistroGetRequestDto> listaDtos = new ArrayList<>():</strong> Aqui estamos preparando uma pilha vazia onde vamos colocar todos os nossos resumos.</li>
    <li><strong>for(Registro r: registros):</strong> Isso é como dizer "Para cada registro de venda em nossa pilha de papéis...".</li>
    <li><strong>listaDtos.add(...):</strong> Aqui estamos pegando as informações de cada registro e colocando no nosso resumo.</li>
    <li><strong>.builder():</strong> Isso é uma forma de começar a criar um resumo a partir dos registros.</li>
    <li><strong>.id(r.getId()) ... .predicoes(r.getPredicoes()):</strong> Estes são os detalhes que estamos escolhendo para incluir no nosso resumo: número de identificação, nome do cliente, nome do produto, nome do vendedor, planos de vendas, histórico de vendas, data da venda e previsões.</li>
    <li><strong>.build():</strong> Isso sinaliza que terminamos de criar um resumo e ele está pronto para ser adicionado à pilha de resumos.</li>
</ul>

<p>Em resumo, 'RegistroConverter' pega todas as informações complexas e detalhadas sobre vendas e as transforma em uma forma mais simples e clara, que é fácil para qualquer pessoa entender quando ela pede para ver essas informações. É como se alguém pedisse um resumo dos eventos mais importantes em um jornal, em vez de ler todas as notícias.</p>
</details>

<h3>Trabalho com Models</h3>
<p>Definição de Estruturas de Dados: Ao criar classes de modelo como Cliente, Vendedor, Produto e Registro, aprendi a definir as estruturas de dados fundamentais para a aplicação, especificando campos, tipos de dados e anotações de validação.</p>
<p>Mapeamento Objeto-Relacional (ORM): Com a utilização do JPA, adquiri habilidades no mapeamento objeto-relacional, mapeando propriedades de classes Java para colunas de banco de dados e compreendendo como operações em objetos Java se traduzem em operações no banco de dados.</p>
<p>Relacionamentos entre Entidades: Aprendi a definir e gerenciar relacionamentos entre diferentes entidades, como relações um-para-muitos e muitos-para-um, essenciais para representar conexões lógicas e regras de negócio no modelo de dados.</p>
<p>Análise e Design de Entidades: Projetar as entidades me ensinou a analisar os requisitos de negócios e traduzi-los em um design de banco de dados eficaz, considerando aspectos como chaves primárias, restrições e relações.</p>

<details>
  <summary><b>Entendendo os Models</b></summary>
  <br>

<p>Imagine que a classe 'Registro' é como um espelho mágico que reflete uma prateleira específica dentro de um imenso armário (o banco de dados). Cada vez que alguém faz uma venda, um formulário é preenchido e colocado nessa prateleira. A classe 'Registro' é a representação desses formulários no mundo dos computadores, onde cada formulário tem informações sobre a venda que aconteceu.</p>

![classeregistro](https://github.com/marcelosilva7/bertoti/assets/101959064/fd51b9ac-dca1-40fd-9b05-053514ada5a8)

<h2>O que cada parte faz:</h2>
<ul>
    <li><strong>O Espelho Mágico (@Entity):</strong> A anotação '@Entity' diz que a nossa classe 'Registro' é um reflexo direto de uma prateleira no armário, onde cada papel é importante e precisa ser guardado com cuidado.</li>
    <li><strong>Etiqueta do Espelho (@Table):</strong> A '@Table' é como uma etiqueta no espelho que nos diz qual é o nome dessa prateleira no banco de dados.</li>
    <li><strong>Canetas Mágicas (@Builder, @Data, @AllArgsConstructor, @NoArgsConstructor):</strong> Estas são ferramentas que fazem o trabalho pesado por nós, como preencher automaticamente os detalhes dos formulários, criar novos ou apagar os antigos.</li>
    <li><strong>O Formulário (public class Registro):</strong> É o próprio papel onde escrevemos as informações da venda.</li>
    <li><strong>Número de Identificação (@Id, @GeneratedValue):</strong> Cada formulário tem um número único, como um documento de identidade, que garante que cada venda seja única e não confunda com outras.</li>
    <li><strong>Data da Venda (@Column):</strong> Este é um campo obrigatório no formulário que registra quando a venda aconteceu. É como a data no canto de uma carta, e não pode ser deixada em branco.</li>
    <li><strong>Linhas de Conexão (@ManyToOne, @OneToMany):</strong> Estas são como linhas invisíveis que ligam o nosso formulário de venda a outros formulários importantes, como os detalhes do vendedor, do produto e do cliente. Eles nos ajudam a ver o quadro completo de cada venda.</li>
    <li><strong>Anexos de Informações (Listas de entidades associadas):</strong> Assim como anexamos documentos adicionais a um formulário, a classe 'Registro' pode ter listas anexadas a ela, como planos de venda futuros, histórico de vendas anteriores e previsões.</li>
    <li><strong>Trabalho em Equipe Inteligente (@JsonBackReference, @JsonManagedReference):</strong> Estas anotações ajudam a controlar o que mostramos quando compartilhamos nossos formulários com outros sistemas, evitando repetição e expondo apenas o que é necessário.</li>
</ul>

<p>Em resumo, a classe 'Registro' não só documenta todas as vendas que acontecem, como também é uma réplica digital da prateleira de vendas no nosso armário de banco de dados. Ela mantém tudo organizado e acessível, permitindo que a loja tenha uma visão clara de suas operações e planeje melhor para o futuro.</p>
</details>

<p>Esses aspectos dos models são fundamentais no desenvolvimento de aplicações baseadas em dados e foram essenciais para aprofundar meu conhecimento em design de software e arquitetura de sistemas. A combinação dessas habilidades com as experiências anteriores em CRUD, controladores, repositórios, serviços e DTOs proporcionou uma compreensão abrangente do desenvolvimento de aplicações web do ponto de vista do Back-End.</p>


obs: detalhamento de codigo, mostrar imagens nos itens, api rest, trechos de codigos, e fazer os details para ficar melhor.


