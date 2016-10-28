$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri('cucumber\feature\test.feature');
formatter.feature({
  "line": 1,
  "name": "asda",
  "description": "",
  "id": "asda",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "asdas",
  "description": "",
  "id": "asda;asdas",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "asdadsa",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "sdfdsf",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "asdads",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});