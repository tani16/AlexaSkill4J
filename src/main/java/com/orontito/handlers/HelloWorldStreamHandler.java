package com.orontito.handlers;

import com.amazon.ask.Skill;
import com.amazon.ask.SkillStreamHandler;
import com.amazon.ask.Skills;

public class HelloWorldStreamHandler extends SkillStreamHandler {
	
	private static Skill getSkill() {
		return Skills.standard()
                .addRequestHandlers(
                        new CancelandStopIntentHandler(),
                        new HelloWorldIntentHandler(),
                        new HelpIntentHandler(),
                        new LaunchRequestHandler(),
                        new SessionEndedRequestHandler())
                .build();
	}
	
	public HelloWorldStreamHandler() {
        super(getSkill());
    }

}
