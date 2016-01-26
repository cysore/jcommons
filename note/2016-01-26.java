language: android
sudo: false
android:
  components:
  - build-tools-23.0.1
  - android-23
  - extra-android-support
  - extra-android-m2repository
script:
- ./gradlew :app:assembleRelease
before_install:
- gem install fir-cli
- openssl aes-256-cbc -K $encrypted_59c5087c0788_key -iv $encrypted_59c5087c0788_iv
  -in dy.keystore.enc -out dy.keystore -d
deploy:
  provider: releases
  api_key:
    secure: Z8T090gRFr++FjS4ow7HoYPZ0YQCWJqVi7bERPRTiBUUGIBnCEtk00JDmPJXXdtzHCoTvN9joxRCfgW/svcKBqj97elZwvPs27qpCHRE0MWhPgiV1qVIHcbNnjk3E5v6DFxW+mFQxREZTFFPu7j/lPS3zYhY7gZqJrIhrnRs4FnA31gn5RgYCwitrann5nj2cp6NRPj+HEghnYzDcG+ERydJDpM1La3EUO69Zhs7NH1HaxjNyqaAG3ACJ8Cjmx3sFAp2Lt+OH5i6tdp3jTJiHPTvc/MgFP4LpLYwC60jmb5X1CZ3Scm+4dVnnoOTX4zDI8YMjuLH0MwKdIRW7MAORtj/ocGWL/Mz8g7E48l+tdVyi8cxAYrMtf4+VSsQUggwAGhr7wt7k6sg/cdwyv+31r+c78zLyAo54UZtHkUNae66jInp03BciF8nqWy/S9ylQSU4ZC5ipxM2fIMSIodGGv44mrw+GXr43xMc+KOnEoCQWFdip7o5VAhgTXWpNRZzrxoy0RfRaXy8ez2N99HtZlUBdEVQPQlEi6PwQaL37Qsl+Zmd8T+xfhavgkmtTRATSRUs4oYaPea1veXxV8LJSuhQYdMaPuCQblt0k6VZN9jqJorNdgib+OkXMzI9hIweFchZc94BUe3uL77/y4VTGYOLlkupvNbVe7E9ZnIbC5g=
  file: app/build/outputs/apk/app-release.apk
  on:
    repo: archmages/DYWeather
    tags: true
    all_branches: true

after_deploy:
- fir p app/build/outputs/apk/app-release.apk -T $FIR_TOKEN -c "`git cat-file tag $TRAVIS_TAG`"

 git remote set-url origin git@github.com:myresources/penging-docs-tms.git