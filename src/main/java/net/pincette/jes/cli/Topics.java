package net.pincette.jes.cli;

import static net.pincette.jes.cli.Application.VERSION;

import picocli.CommandLine.Command;
import picocli.CommandLine.HelpCommand;

@Command(
    name = "topics",
    version = VERSION,
    mixinStandardHelpOptions = true,
    subcommands = {ConsumeTopic.class, HelpCommand.class, ProduceTopic.class},
    description = "Commands to work with JSON Kafka topics")
class Topics {}
