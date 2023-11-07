@ALL @SECURITY @NAVIGATION
Feature: Orange-HRM: Connectivity & Navigation
  The scenarios below verify the following functionalities:
  - Navigation

  Scenario: Navigation
    Given a user connected to the OrangeHRM site
    When the user opens menu MY_INFO
    Then the page 'PIM' is displayed
    When the user opens menu ADMIN__NATIONALITIES
    Then the page 'Admin' is displayed
    When the user opens menu PIM__CONFIGURATION__OPTIONAL_FIELDS
    Then the page 'PIM' is displayed
#    Then the page 'Simulated Error' is displayed
    When the user opens menu PIM__ADD_EMPLOYEE
    Then the page 'PIM' is displayed
    When the user opens menu DASHBOARD
    Then the page 'Dashboard' is displayed
