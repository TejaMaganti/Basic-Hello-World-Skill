package com.main;

import java.util.Optional;
import com.amazon.ask.model.Response;
import static com.amazon.ask.request.Predicates.intentName;
import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.amazon.ask.dispatcher.request.handler.RequestHandler;

//Class Responsible for saying message to user
public class HelloWorldIntentHandler implements RequestHandler {

	public boolean canHandle(HandlerInput input) {
		return input.matches(intentName("HelloWorldIntent"));
	}

	public Optional<Response> handle(HandlerInput input) {
		String SpeechText = "I am alive Hello World";
		return input.getResponseBuilder()
				.withSpeech(SpeechText)
				.withSimpleCard("HelloWorld", SpeechText)
				.build();
	}
}
