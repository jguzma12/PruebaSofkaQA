Feature: Add a pet to the store

  Background:
    * url 'https://petstore.swagger.io/v2'

  Scenario: Add a pet to the store
    Given path '/pet'
    And request { "id": 1, "name": "MascotaPrueba", "status": "available" }
    When method post
    Then status 200

  Scenario: Find pets by status
    Given path '/pet/findByStatus'
    And param status = 'sold'
    When method get
    Then status 200
    And match each response[*].status == 'sold'

  Scenario: Update the name and status of the pet
    Given path '/pet'
    And request { "id": 1, "name": "NuevaMascotaPrueba", "status": "sold" }
    When method put
    Then status 200

  Scenario: Find a pet by ID
    Given path '/pet/{petId}'
    And path petId = 1
    When method get
    Then status 200
    And match response == { "id": 1, "name": "MascotaPrueba", "status": "available" }
