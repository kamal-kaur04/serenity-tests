@ALL @MY_INFO @CUSTOM_FIELDS
Feature: Orange-HRM: Custom fields
  The scenarios below verify the following functionalities:
  - Update blood type

  @isolated
  @BLOOD_TYPE
  Scenario: Update blood type
    Given a user connected to the OrangeHRM site
    When the user opens menu MY_INFO
    And update his blood type with the value 'AB+'
    Then the blood type is updated
