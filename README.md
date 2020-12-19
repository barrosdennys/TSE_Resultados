# TSE_Resultados

Este projeto tem como objetivo automatizar alguns fluxos do aplicativo "Resultados" do TSE.

**Alunos**: Dennys Barros, Ítalo Egypto, Pedro Pires

### **Tecnologias**

- Java <br>
- junit <br>
- Cucumber <br>
- AppiumDriver <br>
- UiSelector <br>
- Selenium <br>

### **Estrutura do projeto**

```
TSE_Resultados/
    java/
        pages/
            MainPage.java
            SelectStatePage.java
            SetupPage.java
        runner/
            CucumberRunner.java
        steps/
            Hooks.java
            MainPageSteps.java
            SelectStateSteps.java
        util/
            Constants.java
            DriverManager.java
            Utils.java
    resources/
        apk/
            Resultados_TSE.apk
        features/
            Features.feature
```
**java** <br>
- pages >> contém os seletores e métodos específicos de cada page, seguindo o padrão PageObject <br>
- runner >> A classe onde o teste é iniciado juntamente com as configurações do Cucumber <br>
- steps >> contém a implementação dos testes em gherkin. Possui também a classe Hooks que rodam métodos antes e depois dos testes <br>
- util >> contém constantes, a implementação e chamada dos métodos relacionados ao AppiumDriver e uma classe utils com métodos que auxiliam no desenvolvimento <br>

**resources** <br>
- apk >> contém a apk Resultados <br>
- features >> contém os arquivos .features escritos em gherkin <br>
___


### **Como rodar os testes**

- Importar o projeto em alguma IDE de preferência (Eclipse, IntelliJ, por exemplo)
- Buildar o build.gradle, carregando assim as dependências necessárias
- Editar a classe java/util/Constants.java de acordo com seu ambiente
- Levantar o server do appium utilizando o Appium Desktop
- Possuir um emulador de Android (AVD, pode ser achado no Android Studio)
- Rodar a classe CucumberRunner.java

### **Report**

Após a geração dos testes, um arquivo .html será gerado na pasta /target com o nome cucumber-html-report.html. 
