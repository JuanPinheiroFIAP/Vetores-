# Projeto itemCollection

Este projeto implementa uma classe `itemCollection` para gerenciar uma coleção de objetos do tipo `Item`. A coleção utiliza um vetor de tamanho fixo para armazenar os itens, permitindo adicionar, buscar, atualizar, remover e listar os itens na coleção.

## Estrutura do Projeto

- **Main.java:** Contém o método `main`, que demonstra o uso da classe `itemCollection` para gerenciar a coleção de itens.
- **Item.java:** Define a classe `Item`, que possui os atributos `Id` e `Valor`.
- **itemCollection.java:** Define a classe `itemCollection`, que gerencia uma coleção de objetos `Item`.

## Funcionalidades

- **Adicionar Item:** Adiciona um item à coleção, desde que haja espaço disponível.
- **Buscar Item:** Busca um item na coleção pelo seu valor.
- **Atualizar Item:** Atualiza o valor de um item existente na coleção.
- **Remover Item:** Remove logicamente um item da coleção, substituindo-o por `null`.
- **Listar Itens:** Exibe todos os itens da coleção, mostrando o índice e os detalhes do item.

## Questões

### 5.1 - Caso seja necessário alterar o tamanho do vetor, como isso pode ser feito? Se o código entregue não suporte essa alteração, liste as melhorias necessárias para que a alteração seja possível.

Atualmente, o tamanho do vetor é definido no momento da criação da instância de `itemCollection` e não pode ser alterado posteriormente. Para suportar a alteração do tamanho do vetor, seria necessário:

1. **Criação de um método para redimensionar o vetor:**
   - Um método `redimensionar(int novoTamanho)` poderia ser implementado para criar um novo vetor com o tamanho especificado e copiar os itens existentes para o novo vetor.
   
2. **Cópia dos elementos para o novo vetor:**
   - Dentro do método `redimensionar`, seria necessário copiar todos os elementos do vetor atual para o novo vetor, preservando a ordem dos itens.

3. **Substituição do vetor antigo pelo novo:**
   - Após a cópia, o vetor antigo seria substituído pelo novo vetor de tamanho ajustado.

### 5.2 - O que acontecerá caso o usuário tente incluir uma quantidade de itens maior do que o tamanho do vetor? Existe algo que possa ser feito para mitigar esse risco?

Se o usuário tentar adicionar mais itens do que a capacidade do vetor, a operação será interrompida, e uma mensagem "Vetor está cheio!" será exibida. O item não será adicionado à coleção.

**Mitigação:**

- **Implementação de um vetor dinâmico:**
  - A classe `itemCollection` pode ser modificada para que o vetor seja redimensionado automaticamente (aumentando seu tamanho) quando sua capacidade atual for atingida. Isso pode ser feito implementando o método de redimensionamento mencionado na questão 5.1.
  
- **Uso de uma estrutura de dados alternativa:**
  - Utilizar uma estrutura de dados como `ArrayList` em vez de um vetor fixo, pois `ArrayList` cresce automaticamente conforme novos itens são adicionados.

### 5.3 - O que acontecerá caso o usuário tente excluir um item que não existe no vetor?

Se o usuário tentar remover um item em um índice que não existe (ou seja, um índice fora dos limites do vetor), o código lançará uma exceção `IndexOutOfBoundsException` com a mensagem "valor invalido!".

**Mitigação:**

- **Verificação prévia de índice:**
  - Antes de tentar remover um item, o código pode verificar se o índice fornecido está dentro dos limites válidos (0 até o tamanho do vetor - 1). Se o índice for inválido, uma mensagem de erro amigável pode ser exibida ao invés de lançar uma exceção.
