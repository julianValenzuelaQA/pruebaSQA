Feature: Compra de productos en san angel

  Scenario: compra de producto en san angel
    Given que estoy en la pagina home de san angel
    When agrego el primer producto con sus detalles "2"
    And vuelvo a la pagina Home de san angel
    And agrego el segundo producto con sus detalles "5"
    Then deberia ver los productos en el carrito