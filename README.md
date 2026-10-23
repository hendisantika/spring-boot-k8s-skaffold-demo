![](./img/header.png)

## [spring-boot-k8s-skaffold-demo](#spring-boot-k8s-skaffold-demo)

[![Java CI with Maven](https://github.com/hendisantika/spring-boot-k8s-skaffold-demo/actions/workflows/maven.yml/badge.svg)](https://github.com/hendisantika/spring-boot-k8s-skaffold-demo/actions/workflows/maven.yml)
![Java](https://img.shields.io/badge/Java-25-orange?logo=openjdk)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-4.1-brightgreen?logo=springboot)
![Dependabot](https://img.shields.io/badge/Dependabot-enabled-blue?logo=dependabot)

Deploy springboot application in kubernetes using skaffold.

## [Tech Stack](#tech-stack)

| Component      | Version                          |
|----------------|----------------------------------|
| Java (JDK)     | 25                               |
| Spring Boot    | 4.1.x                            |
| Maven          | 3.10.x (via Maven Wrapper `mvnw`) |
| Jib            | 3.5.x (base image `eclipse-temurin:25-jre`) |
| Skaffold       | `skaffold/v4beta13` config       |

## [Prerequisite / Libraries used](#Prerequisite)

* JDK 25.
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
* The container image is built with [Jib](https://github.com/GoogleContainerTools/jib) on top of
  `eclipse-temurin:25-jre`, so no Dockerfile is needed.

## [Compilation command](#compilation-command)

```./mvnw clean package -DskipTests```

## [Execution command](#execution-command)

```skaffold dev``` : To build and deploy your application every time your code changes.

```skaffold run``` : To build and deploy your application once.

## [API end-points](#API-end-points)

- GET -> `http://localhost:30143/hello` - This prints "Welcome to Skaffold".

## [Uninstall kubernetes objects for spring-boot app](#uninstall)

```CTRL + C``` : To stop the spring-boot app.

```skaffold delete```: To delete all the kubernetes objects.

## [CI/CD](#ci-cd)

GitHub Actions ([`.github/workflows/maven.yml`](.github/workflows/maven.yml)) runs on every push and pull request
to `main`:

* **build** – sets up Temurin JDK 25 and runs `./mvnw -B package` (compile + tests).
* **dependency-submission** – on pushes to `main` only, uploads the Maven dependency graph to GitHub to improve
  Dependabot alerts.

## [Dependabot](#dependabot)

[`.github/dependabot.yml`](.github/dependabot.yml) checks daily at 05:00 (Asia/Jakarta) for:

* **Maven** dependencies, plugins and the Maven wrapper – grouped into `spring-boot`, `maven-plugins` and
  `minor-and-patch` PRs, labelled `dependencies` + `java`, committed as `build(deps): ...`.
* **GitHub Actions** – grouped into a single `github-actions` PR, labelled `dependencies` + `github_actions`,
  committed as `ci(deps): ...`.
