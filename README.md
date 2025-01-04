# Sentilizer


[Sentilizer](https://github.com/sylnit/sentilizer) provides a natural language for sentiment analysis. It is written in Java and can take human readable language text input and produce the base form of words, their parts of speech, whether they are names of companies, people, etc.

The Sentilizer is a sentiment analyzer which is built on top of the Stanford CoreNLP.

### Features
> Analyze sentiment based on the English model

### Usage
1. Create a new Maven project. If you are using IntelliJ Idea, open the IDE and click on "Create New Project and Choose Maven"
2. Add dependencies
Open the pom.xml file of your project and add the following dependency
```declarative
<dependencies>
    <dependency>
        <groupId>org.sylnit</groupId>
        <artifactId>sentilizer</artifactId>
        <version>1.0-SNAPSHOT</version>
    </dependency>
    ...
</dependencies>
```
3. Reload All Maven Project to install the dependencies
4. Write your code and include the necessary classes.

### Example
``` java
String text = "Simplest codings is the best place to learn and grow. I am glad to be here.";
Sentilizer sentilizer = new Sentilizer();
String sentiment = sentilizer.analyze(text);
```

### Discussions and development
Development discussions take place on the issues page. If you notice any bug or want to contribute a new feature, please raise it on the issues page for further discussion.

### Contribution
If you want to contribute, kindly checkout the issues page. Then fork the repository and create your solution in a branch and raise Pull Request to main branch.