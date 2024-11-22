# Estudo Sobre Polimorfismo (Interface x Herança).

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
* Com essa abordagem, demonstramos como o polimorfismo por herança e por interface pode ser aplicado em Java, destacando suas vantagens práticas e a importância de cada implementação no desenvolvimento de software modular e fácil de manter.
