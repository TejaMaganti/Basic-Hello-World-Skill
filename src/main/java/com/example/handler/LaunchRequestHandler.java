package com.example.handler;

import java.util.Optional;
import static com.amazon.ask.request.Predicates.requestType;
import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.amazon.ask.dispatcher.request.handler.RequestHandler;
import com.amazon.ask.model.LaunchRequest;
import com.amazon.ask.model.Response;

public class LaunchRequestHandler implements RequestHandler {

	public boolean canHandle(HandlerInput input) {
		return input.matches(requestType(LaunchRequest.class));
	}

	public Optional<Response> handle(HandlerInput input) {
		String SpeechText = "Welcome to Hello World, you can say Hello";
		return input.getResponseBuilder()
				.withSpeech(SpeechText)
				.withSimpleCard("HelloWorld", SpeechText)
				.withReprompt(SpeechText)
				.build();
	}
}
