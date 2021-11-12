package main.model;

import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter

public enum ModerationStatus {
    NEW,
    ACCEPTED,
    DECLINED
}
