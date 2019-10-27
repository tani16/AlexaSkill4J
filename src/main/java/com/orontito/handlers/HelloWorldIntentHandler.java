package com.orontito.handlers;

import java.util.Optional;

import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.amazon.ask.dispatcher.request.handler.impl.IntentRequestHandler;
import com.amazon.ask.model.Intent;
import com.amazon.ask.model.IntentRequest;
import com.amazon.ask.model.Response;

public class HelloWorldIntentHandler implements IntentRequestHandler {

	public boolean canHandle(HandlerInput input, IntentRequest intentRequest) {
		return intentRequest.getIntent().getName().equals("HelloWorldIntent");
	}

	public Optional<Response> handle(HandlerInput input, IntentRequest intentRequest) {
		String speechText = "Hello world";

        Intent intent = intentRequest.getIntent();
        String intentName = intent.getName();

        return input.getResponseBuilder()
                .withSpeech(speechText)
                .withSimpleCard(intentName, speechText)
                .build();
	}
	
//	@Override
//    public boolean canHandle(HandlerInput input) {
//        return input.matches(Predicates.intentName("HelloWorldIntent"));
//    }
//
//    @Override
//    public Optional<Response> handle(HandlerInput input) {
//        String speechText = "Hello world";
//        return input.getResponseBuilder()
//                .withSpeech(speechText)
//                .withSimpleCard("HelloWorld", speechText)
//                .build();
//    }

}
