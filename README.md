![](./img/header.png)

## [spring-boot-k8s-skaffold-demo](#spring-boot-k8s-skaffold-demo)

Deploy springboot application in kubernetes using skaffold.

## [Prerequisite / Libraries used](#Prerequisite)

* Docker and kubernetes cluster.
* kubectl.
* Spring Boot.
* Spring Configuration.
* Spring REST Controller.
* Skaffold.

## [Skaffold](#skaffold)

Skaffold is a command line tool that facilitates continuous development for Kubernetes-native applications. Skaffold
handles the workflow for building, pushing, and deploying your application, and provides building blocks for creating
CI/CD pipelines. This enables you to focus on iterating on your application locally while Skaffold continuously deploys
to your local or remote Kubernetes cluster.

* skaffold.yml is used by the Skaffold CLI.
* k8s-deployment.yml & k8s-service.yml are used for deployment into the K8s cluster and they are integrated into the
  skaffold.yml for continuous deployment.

## [Compilation command](#compilation-command)

```mvn clean package -DskipTests```

## [Execution command](#execution-command)

```skaffold dev``` : To build and deploy your application every time your code changes.

```skaffold run``` : To build and deploy your application once.

## [API end-points](#API-end-points)

- GET -> `http://localhost:30143/hello` - This prints "Welcome to Skaffold".

## [Uninstall kubernetes objects for spring-boot app](#uninstall)

```CTRL + C``` : To stop the spring-boot app.

```skaffold delete```: To delete all the kubernetes objects.