# Estudo sobre polimorfismo (Herança x Interfaces).

# Polimorfismo por Herança
# Definição:

* O polimorfismo por herança ocorre quando uma classe filha herda de uma classe pai e pode usar ou sobrescrever os métodos do pai.

# Características:

* Hierarquia: Cria uma relação hierárquica entre as classes.
* Reutilização de Código: Facilita a reutilização de código ao permitir que subclasses utilizem ou modifiquem métodos e propriedades da superclasse.
* Sobrescrita de Métodos: Subclasses podem sobrescrever métodos da superclasse para fornecer implementações específicas.

# Vantagens:

* Flexibilidade: Permite adicionar novos tipos de objetos (subclasses) sem modificar a lógica existente na superclasse.
* Desacoplamento: Separa a lógica do método da implementação específica do objeto.
* Reusabilidade: Métodos e propriedades comuns são definidos na superclasse e reutilizados pelas subclasses.
* Manutenção: Mudanças na superclasse são propagadas automaticamente para as subclasses.

# Polimorfismo por Interface
# Definição:

* O polimorfismo por interface ocorre quando uma classe implementa uma interface e define os métodos especificados por essa interface.

# Características:

* Contratos: Uma interface define um conjunto de métodos que uma classe deve implementar, estabelecendo um contrato.
* Desacoplamento: Interfaces promovem o desacoplamento do código, permitindo que diferentes classes compartilhem comportamentos comuns sem estarem diretamente relacionadas por herança.
* * Múltiplas Implementações: Uma classe pode implementar várias interfaces, superando a limitação de herança única.

# Vantagens:

* Abstração: Define o comportamento que uma classe deve ter sem especificar a implementação.
* Flexibilidade: Permite que diferentes classes, não relacionadas por herança, compartilhem comportamentos comuns e sejam tratadas de maneira uniforme.
* Reusabilidade: Métodos genéricos podem ser aplicados a qualquer classe que implemente a interface, independentemente de sua hierarquia.
* Desacoplamento: Facilita a substituição e intercambiabilidade de implementações, promovendo um design mais modular e flexível.

# Conclusões:

O polimorfismo, seja por herança ou interfaces, é essencial para criar sistemas flexíveis, reutilizáveis e fáceis de manter. Ele permite que diferentes tipos de objetos sejam tratados de maneira uniforme, simplificando o design e a implementação de software modular e robusto. A escolha entre herança e interfaces depende do contexto e das necessidades específicas do projeto, mas ambos são fundamentais para a programação orientada a objetos.

# Explicação sobre o código:

# Polimorfismo por Herança
# Descrição:

* A classe Animal é uma classe base abstrata que define o método abstrato fazerSom().
* As classes Cachorro, Gato e Papagaio estendem Animal e implementam o método fazerSom() com suas próprias versões específicas.
* Na classe TesteAnimais, criamos instâncias de Cachorro, Gato e Papagaio usando uma variável de referência do tipo Animal e chamamos o método fazerSom(), demonstrando o polimorfismo.

# Vantagens:

* Flexibilidade: Adiciona novos tipos de animais facilmente sem modificar a lógica existente.
* Desacoplamento: A lógica do método é separada do tipo específico de animal.
* Reusabilidade: O método fazerSom() pode ser chamado em qualquer objeto que estenda Animal.
* Manutenibilidade: Qualquer mudança no comportamento específico de um animal é restrita à sua classe.

# Polimorfismo por Interface
# Descrição:

* A interface FazSom define o método emitirSom().
* As classes Cachorro, Gato, Papagaio e Alarme implementam a interface FazSom, fornecendo suas próprias implementações do método emitirSom().
* Na classe TesteSons, criamos uma lista de FazSom e adicionamos instâncias de Cachorro, Gato, Papagaio e Alarme à lista. Chamamos o método reproduzirSons(), que itera sobre a lista e chama o método emitirSom() em cada objeto.

# Vantagens:

* Flexibilidade: Permite adicionar novos tipos de objetos que implementam a interface sem modificar a lógica existente.
* Desacoplamento: A lógica de emissão de som é desacoplada do tipo específico de objeto.
* Reusabilidade: O método emitirSom() pode ser chamado em qualquer objeto que implemente a interface FazSom.
* Polimorfismo de Interface: Permite que diferentes classes, sem relação direta de herança, compartilhem comportamentos comuns e sejam tratadas de maneira uniforme.

