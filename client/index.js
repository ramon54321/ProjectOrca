#!/usr/bin/env node

const { Orca }  = require('./lib/orca')

const orca = new Orca()

console.log(orca.getNetState)

setTimeout(() => console.log(orca.getNetState), 1000)
