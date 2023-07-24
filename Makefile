TEST_DIRS := LinkedList

test:
	@for dir in $(TEST_DIRS); do \
		echo "Running tests in $$dir..."; \
		cd $$dir && $(MAKE) test; \
		cd ..; \
    done
