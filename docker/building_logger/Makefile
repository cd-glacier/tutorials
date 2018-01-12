
build:
	docker build -t log-image .

run:
	docker run -it --name log-container log-image

build-server:
	docker build -t web-image -f Dockerfile.web .

run-server:
	docker run -d --name web-container \
		-p 80:80 \
		-v $(PWD)/log:/var/log/httpd \
		--volumes-from log-container \
		web-image
