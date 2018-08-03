
Feature: Extra perks to frequent flyers
Business Need: As as AirlineProvider
  I want to give extra discount to customers whoever has travelled 10000 km with us
  In order to promote my air lines

  Scenario Outline: Extra discount to frequent flyers
    Given customer is new to airlines
    When Customer completes "<distanceTravelled>" km with the airlines
    Then An extra discount of "<dicountoffered>" percent should be provided to customer for next booking

    Examples:
    |distanceTravelled|dicountoffered|
    |10000            |10            |
    |20000            |15            |
    |30000            |20            |

  @Critical
  Scenario Outline: Extra discount to frequent flyers
    Given customer is new to airlines
    When Customer completes "<distanceTravelled>" km with the airlines
    Then An extra discount of "<dicountoffered>" percent should be provided to customer for next booking

    Examples:
      |distanceTravelled|dicountoffered|
      |10000            |10            |
      |20000            |15            |
      |30000            |20            |






