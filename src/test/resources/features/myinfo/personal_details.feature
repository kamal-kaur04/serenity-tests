@ALL @MY_INFO @PERSONAL_DETAILS
Feature: Orange-HRM: Personal Details
  The scenarios below verify the following functionalities:
  - Update personal info from file
  - Update personal info from data table

  Scenario: Update personal info from data table
    Given a user connected to the OrangeHRM site
    When the user opens menu MY_INFO
    And the user updates his personal details with following data
      | nickName         | smoker | militaryService |
      | simple for tests | false  | 9876543210      |

  Scenario: Update personal info from file
    Given a user connected to the OrangeHRM site
    When the user opens menu MY_INFO
    And the user updates his personal details with the data 'partial'
