# Author: Juan David Martínez Botero
@stories
Feature: Academy Choucair
  As a user, I want to learn how to automate in screanplay at the Choucair Academy with the automation course
  @scenario1
  Scenario Outline: Search for an automation course
    Given than Juan wants to learn automation at the Academy Choucair
      | strUser   | strPassword   |
      | <strUser> | <strPassword> |
    When he searches for the course on the choucair academy platform
      | strCourse   |
      | <strCourse> |
    Then he finds the course called
      | strCourse   |
      | <strCourse> |

    Examples:
      | strUser   | strPassword   | strCourse               |
      | rpenaa    | Febrero.2020  | Metodología Bancolombia |

