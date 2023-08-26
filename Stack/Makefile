.PHONY: test

test: test-python test-go test-java

test-python:
	@ cd python && python -m unittest discover

test-go:
	@ cd go && go test

test-java:
	@ cd java && gradle test