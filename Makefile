DIRS := $(wildcard */.)

.PHONY: test

test:
	@for dir in $(DIRS); do \
        echo "INFO: Processing directory: $$dir"; \
        if [ -f "$$dir/Makefile" ] && grep -q '^\s*test:' "$$dir/Makefile"; then \
            echo "INFO: Executing 'make test' in $$dir"; \
            $(MAKE) -C $$dir test; \
        else \
            echo "WARNING: No 'test' target found in $$dir"; \
        fi \
    done

test-python:
	@for dir in $(DIRS); do \
        echo "INFO: Processing directory: $$dir"; \
        if [ -f "$$dir/Makefile" ] && grep -q '^\s*test-python:' "$$dir/Makefile"; then \
            echo "INFO: Executing 'make test-python' in $$dir"; \
            $(MAKE) -C $$dir test-python; \
        else \
            echo "WARNING: No 'test-python' target found in $$dir"; \
        fi \
    done

test-go:
	@for dir in $(DIRS); do \
        echo "INFO: Processing directory: $$dir"; \
        if [ -f "$$dir/Makefile" ] && grep -q '^\s*test-go:' "$$dir/Makefile"; then \
            echo "INFO: Executing 'make test-go' in $$dir"; \
            $(MAKE) -C $$dir test-go; \
        else \
            echo "WARNING: No 'test-go' target found in $$dir"; \
        fi \
    done

test-java:
	@for dir in $(DIRS); do \
        echo "INFO: Processing directory: $$dir"; \
        if [ -f "$$dir/Makefile" ] && grep -q '^\s*test-java:' "$$dir/Makefile"; then \
            echo "INFO: Executing 'make test-java' in $$dir"; \
            $(MAKE) -C $$dir test-java; \
        else \
            echo "WARNING: No 'test-java' target found in $$dir"; \
        fi \
    done