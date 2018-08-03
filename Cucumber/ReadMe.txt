Serenity Cucumber Report Formater = plugin="cucumber.runtime.formatter.SerenityReporter";

Cucumber Default Reporter= plugin = {"pretty", "html:target/Destination"}

mvn clean install -Dcucumber.options="--tags @tagname"


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




