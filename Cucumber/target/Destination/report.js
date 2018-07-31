$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/Feature/FrequentFlyer.feature");
formatter.feature({
  "name": "Extra perks to frequent flyers",
  "description": "Business Need: As as AirlineProvider\n  I want to give extra discount to customers whoever has travelled 10000 km with us\n  In order to promote my air lines",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Extra discount to frequent flyers",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "customer is new to airlines",
  "keyword": "Given "
});
formatter.match({
  "location": "FrequentFlyersSteps.customer_is_new_to_airlines()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Customer completes 10000 km with the airlines",
  "keyword": "When "
});
formatter.match({
  "location": "FrequentFlyersSteps.customer_completes_km_with_the_airlines()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "An extra discount of \"10\" percent should be provided to customer for next booking",
  "keyword": "Then "
});
formatter.match({
  "location": "FrequentFlyersSteps.an_extra_discount_of_percent_should_be_provided_to_customer_for_next_booking(String)"
});
formatter.result({
  "status": "passed"
});
});