#!/bin/bash
for ((i=1;i<=100;i++));
do
  curl "localhost:8080/endpointA"
  curl "localhost:8080/endpointB"
  curl "localhost:8080/endpointC"
  curl "localhost:8080/endpointD"
done
