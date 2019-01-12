package com.tfkfan.grammarext.cucumber.stepdefs;

import com.tfkfan.grammarext.GrammarInboxExtApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = GrammarInboxExtApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
