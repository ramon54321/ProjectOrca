#!/usr/bin/env zsh

mkdir -p ./out
cp requires.js ./out/orca.js && cat ./js/target/scala-2.13/orca-fastopt/main.js >> ./out/orca.js
cp ./out/orca.js ../client/lib/orca.js
