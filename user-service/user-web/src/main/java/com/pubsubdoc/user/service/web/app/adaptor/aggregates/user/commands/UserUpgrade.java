package com.pubsubdoc.user.service.web.app.adaptor.aggregates.user.commands;

import com.pubsubdoc.user.service.shared.application.doc.models.user.UserId;

public record UserUpgrade(UserId userId) implements UserCommand {
}
