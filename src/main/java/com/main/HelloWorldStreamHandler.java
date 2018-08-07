package com.main;

import com.amazon.ask.Skill;
import com.amazon.ask.SkillStreamHandler;
import com.amazon.ask.Skills;
import com.example.handler.*;

public class HelloWorldStreamHandler extends SkillStreamHandler {
	
	private static Skill getSkill() {
		return Skills.standard()
				.addRequestHandlers(
						new CancelandStopIntentHandler(),
						new HelloWorldIntentHandler(),
						new HelpIntentHandler(),
						new LaunchRequestHandler(),
						new SessionEndedRequestHandler())
				.withSkillId("amzn1.ask.skill.5597c825-5fd5-46cf-b842-4e514a3cfc18")
				.build();
	}

	public HelloWorldStreamHandler() {
		super(getSkill());
	}

}
