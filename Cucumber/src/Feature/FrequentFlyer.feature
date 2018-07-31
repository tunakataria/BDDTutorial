
Feature: Extra perks to frequent flyers
Business Need: As as AirlineProvider
  I want to give extra discount to customers whoever has travelled 10000 km with us
  In order to promote my air lines

  Scenario: Extra discount to frequent flyers
    Given customer is new to airlines
    When Customer completes 10000 km with the airlines
    Then An extra discount of "10" percent should be provided to customer for next booking



