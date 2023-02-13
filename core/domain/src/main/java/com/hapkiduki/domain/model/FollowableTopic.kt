package com.hapkiduki.domain.model

import com.hapkiduki.model.data.Topic

/**
 * A [topic] with the additional information for whether or not it is followed.
 */
data class FollowableTopic( // TODO consider changing to UserTopic and flattening
    val topic: Topic,
    val isFollowed: Boolean,
)