# Sentilizer


[Sentilizer](https://github.com/sylnit/sentilizer) provides a natural language for sentiment analysis. It is written in Java and can take human readable language text input and produce the base form of words, their parts of speech, whether they are names of companies, people, etc.

The Sentilizer is a sentiment analyzer which is built on top of the Stanford CoreNLP.

### Features
> analyze sentiment based on the English model

### Usage


### Example
``` java
String text = "Simplest codings is the best place to learn and grow. I am glad to be here.";
Sentilizer sentilizer = new Sentilizer();
String sentiment = sentilizer.analyze(text);
```

### Discussions and development
Development discussions are taking place on the issues page. If you notice any bug or need for a new feature, please raise it on the issues page for further discussion.

### Contribution
If you want to contribute, kindly checkout the issues on the issues page. The fork the repository and create your solution in a branch and raise Pull Request to main branch.