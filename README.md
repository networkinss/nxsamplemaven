# Nxmavensample

## Setup
pnpx create-nx-workspace@latest apifox --preset=react-monorepo

### Maven Plugin

Just once install and init:  
pnpm install --save-dev @jnxplus/nx-maven  
nx generate @jnxplus/nx-maven:init
Result:  
`nx show projects`
samplereact-e2e  
samplereact  
nxsampleparent

### Add a maven application:

`nx generate @jnxplus/nx-maven:application springservice --javaVersion 17 --groupId ch.inss --language java --framework spring-boot --directory apps`  
Stdout:

```bash
Could not format pom.xml. Error: "require() of ES Module /home/amrit/WebstormProjects/nx/maven/nxmavensample/node_modules/.pnpm/@prettier+plugin-xml@3.4.1_prettier@2.8.8/node_modules/@prettier/plugin-xml/src/plugin.js from /home/amrit/WebstormProjects/nx/maven/nxmavensample/node_modules/.pnpm/prettier@2.8.8/node_modules/prettier/index.js not supported.
Instead change the require of plugin.js in /home/amrit/WebstormProjects/nx/maven/nxmavensample/node_modules/.pnpm/prettier@2.8.8/node_modules/prettier/index.js to a dynamic import() which is available in all CommonJS modules."
Could not format apps/springservice/project.json. Error: "require() of ES Module /home/amrit/WebstormProjects/nx/maven/nxmavensample/node_modules/.pnpm/@prettier+plugin-xml@3.4.1_prettier@2.8.8/node_modules/@prettier/plugin-xml/src/plugin.js from /home/amrit/WebstormProjects/nx/maven/nxmavensample/node_modules/.pnpm/prettier@2.8.8/node_modules/prettier/index.js not supported.
Instead change the require of plugin.js in /home/amrit/WebstormProjects/nx/maven/nxmavensample/node_modules/.pnpm/prettier@2.8.8/node_modules/prettier/index.js to a dynamic import() which is available in all CommonJS modules."
Could not format apps/springservice/pom.xml. Error: "require() of ES Module /home/amrit/WebstormProjects/nx/maven/nxmavensample/node_modules/.pnpm/@prettier+plugin-xml@3.4.1_prettier@2.8.8/node_modules/@prettier/plugin-xml/src/plugin.js from /home/amrit/WebstormProjects/nx/maven/nxmavensample/node_modules/.pnpm/prettier@2.8.8/node_modules/prettier/index.js not supported.
Instead change the require of plugin.js in /home/amrit/WebstormProjects/nx/maven/nxmavensample/node_modules/.pnpm/prettier@2.8.8/node_modules/prettier/index.js to a dynamic import() which is available in all CommonJS modules."
Could not format apps/springservice/src/main/resources/application.yml. Error: "require() of ES Module /home/amrit/WebstormProjects/nx/maven/nxmavensample/node_modules/.pnpm/@prettier+plugin-xml@3.4.1_prettier@2.8.8/node_modules/@prettier/plugin-xml/src/plugin.js from /home/amrit/WebstormProjects/nx/maven/nxmavensample/node_modules/.pnpm/prettier@2.8.8/node_modules/prettier/index.js not supported.
Instead change the require of plugin.js in /home/amrit/WebstormProjects/nx/maven/nxmavensample/node_modules/.pnpm/prettier@2.8.8/node_modules/prettier/index.js to a dynamic import() which is available in all CommonJS modules."
Could not format apps/springservice/src/test/resources/application.yml. Error: "require() of ES Module /home/amrit/WebstormProjects/nx/maven/nxmavensample/node_modules/.pnpm/@prettier+plugin-xml@3.4.1_prettier@2.8.8/node_modules/@prettier/plugin-xml/src/plugin.js from /home/amrit/WebstormProjects/nx/maven/nxmavensample/node_modules/.pnpm/prettier@2.8.8/node_modules/prettier/index.js not supported.
Instead change the require of plugin.js in /home/amrit/WebstormProjects/nx/maven/nxmavensample/node_modules/.pnpm/prettier@2.8.8/node_modules/prettier/index.js to a dynamic import() which is available in all CommonJS modules."
Could not format apps/springservice/src/main/java/ch/inss/springservice/HelloController.java. Error: "require() of ES Module /home/amrit/WebstormProjects/nx/maven/nxmavensample/node_modules/.pnpm/@prettier+plugin-xml@3.4.1_prettier@2.8.8/node_modules/@prettier/plugin-xml/src/plugin.js from /home/amrit/WebstormProjects/nx/maven/nxmavensample/node_modules/.pnpm/prettier@2.8.8/node_modules/prettier/index.js not supported.
Instead change the require of plugin.js in /home/amrit/WebstormProjects/nx/maven/nxmavensample/node_modules/.pnpm/prettier@2.8.8/node_modules/prettier/index.js to a dynamic import() which is available in all CommonJS modules."
Could not format apps/springservice/src/main/java/ch/inss/springservice/SpringserviceApplication.java. Error: "require() of ES Module /home/amrit/WebstormProjects/nx/maven/nxmavensample/node_modules/.pnpm/@prettier+plugin-xml@3.4.1_prettier@2.8.8/node_modules/@prettier/plugin-xml/src/plugin.js from /home/amrit/WebstormProjects/nx/maven/nxmavensample/node_modules/.pnpm/prettier@2.8.8/node_modules/prettier/index.js not supported.
Instead change the require of plugin.js in /home/amrit/WebstormProjects/nx/maven/nxmavensample/node_modules/.pnpm/prettier@2.8.8/node_modules/prettier/index.js to a dynamic import() which is available in all CommonJS modules."
Could not format apps/springservice/src/test/java/ch/inss/springservice/SpringserviceApplicationTests.java. Error: "require() of ES Module /home/amrit/WebstormProjects/nx/maven/nxmavensample/node_modules/.pnpm/@prettier+plugin-xml@3.4.1_prettier@2.8.8/node_modules/@prettier/plugin-xml/src/plugin.js from /home/amrit/WebstormProjects/nx/maven/nxmavensample/node_modules/.pnpm/prettier@2.8.8/node_modules/prettier/index.js not supported.
Instead change the require of plugin.js in /home/amrit/WebstormProjects/nx/maven/nxmavensample/node_modules/.pnpm/prettier@2.8.8/node_modules/prettier/index.js to a dynamic import() which is available in all CommonJS modules."
Could not format apps/springservice/src/test/java/ch/inss/springservice/HelloControllerTests.java. Error: "require() of ES Module /home/amrit/WebstormProjects/nx/maven/nxmavensample/node_modules/.pnpm/@prettier+plugin-xml@3.4.1_prettier@2.8.8/node_modules/@prettier/plugin-xml/src/plugin.js from /home/amrit/WebstormProjects/nx/maven/nxmavensample/node_modules/.pnpm/prettier@2.8.8/node_modules/prettier/index.js not supported.
Instead change the require of plugin.js in /home/amrit/WebstormProjects/nx/maven/nxmavensample/node_modules/.pnpm/prettier@2.8.8/node_modules/prettier/index.js to a dynamic import() which is available in all CommonJS modules."
CREATE apps/springservice/project.json
CREATE apps/springservice/pom.xml
CREATE apps/springservice/src/main/java/ch/inss/springservice/HelloController.java
CREATE apps/springservice/src/main/java/ch/inss/springservice/SpringserviceApplication.java
CREATE apps/springservice/src/main/resources/application.yml
CREATE apps/springservice/src/test/java/ch/inss/springservice/HelloControllerTests.java
CREATE apps/springservice/src/test/java/ch/inss/springservice/SpringserviceApplicationTests.java
CREATE apps/springservice/src/test/resources/application.yml
UPDATE pom.xml
```

`nx show projects`  
samplereact-e2e  
springservice  
samplereact  
nxsampleparent

`nx build springservice`  
Building target folder as expected.

`nx build nxsampleparent`  
Building only parent, while mvn package builds also sub-module springservice.

### Add a maven library:

nx generate @jnxplus/nx-maven:library mavenlib1 --javaVersion 17 --groupId ch.inss --directory libs  
nx generate @jnxplus/nx-maven:library mavenlib2 --javaVersion 17 --groupId ch.inss --directory libs  
`nx run-many --parallel=2 --verbose=false --target=build`

## Integrate with editors

Enhance your Nx experience by installing [Nx Console](https://nx.dev/nx-console) for your favorite editor. Nx Console
provides an interactive UI to view your projects, run tasks, generate code, and more! Available for VSCode, IntelliJ and
comes with a LSP for Vim users.

## Start the application

Run `npx nx serve samplereact` to start the development server. Happy coding!

## Build for production

Run `npx nx build samplereact` to build the application. The build artifacts are stored in the output directory (e.g. `dist/` or `build/`), ready to be deployed.

## Running tasks

To execute tasks with Nx use the following syntax:

```
npx nx <target> <project> <...options>
```

You can also run multiple targets:

```
npx nx run-many -t <target1> <target2>
```

..or add `-p` to filter specific projects

```
npx nx run-many -t <target1> <target2> -p <proj1> <proj2>
```

Targets can be defined in the `package.json` or `projects.json`. Learn more [in the docs](https://nx.dev/features/run-tasks).

## Set up CI!

Nx comes with local caching already built-in (check your `nx.json`). On CI you might want to go a step further.

- [Set up remote caching](https://nx.dev/features/share-your-cache)
- [Set up task distribution across multiple machines](https://nx.dev/nx-cloud/features/distribute-task-execution)
- [Learn more how to setup CI](https://nx.dev/recipes/ci)

## Explore the project graph

Run `npx nx graph` to show the graph of the workspace.
It will show tasks that you can run with Nx.

- [Learn more about Exploring the Project Graph](https://nx.dev/core-features/explore-graph)

## Connect with us!

- [Join the community](https://nx.dev/community)
- [Subscribe to the Nx Youtube Channel](https://www.youtube.com/@nxdevtools)
- [Follow us on Twitter](https://twitter.com/nxdevtools)
