Please update the browserstack.user, browserstack.key and update `remote.url` in serenity.conf :
```
browserstack.user="${BROWSERSTACK_USER}"
browserstack.key="${BROWSERSTACK_KEY}"
```

```
webdriver {
  driver = remote
  remote.url =
  "https://'${BROWSERSTACK_USER}':'${BROWSERSTACK_KEY}'@hub.browserstack.com/wd/hub"
}
```

Run command -

```
mvn clean verify -Ds4t.browser=chrome -Ds4t.driverPath="c:/dev/tools/selenium/chromedriver.exe" -Ds4t.optionsAsYamlResource=chrome_options_default.yml -Dcucumber.filter.tags=@BLOOD_TYPE
```
