package org.sylnit;

import edu.stanford.nlp.ling.CoreAnnotations;
import edu.stanford.nlp.pipeline.Annotation;
import edu.stanford.nlp.pipeline.StanfordCoreNLP;
import edu.stanford.nlp.sentiment.SentimentCoreAnnotations;
import edu.stanford.nlp.util.CoreMap;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Sentilizer {

    private StanfordCoreNLP pipeline;

    public Sentilizer(){
        //initialize the stanford NLP pipeline
        pipeline = new StanfordCoreNLP("application.properties");
    }

    public String analyze(String text){
        //Perform sentiment analysis
        return getSentiment(text);
    }

    private String getSentiment(String text){
        //Create an annotation object with the input text
        Annotation annotation = new Annotation(text);

        //Run all the NLP annotators on the text
        pipeline.annotate(annotation);

        //Extract the sentiment from the annotation
        CoreMap sentence = annotation.get(CoreAnnotations.SentencesAnnotation.class).get(0);

        return sentence.get(SentimentCoreAnnotations.SentimentClass.class);
    }
}
