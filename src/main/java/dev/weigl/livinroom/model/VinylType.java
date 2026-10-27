package dev.weigl.livinroom.model;

import lombok.Getter;

public enum VinylType {
    LP(2), DOUBLE_LP(4);

    @Getter
    private final int sides;

    VinylType(int sides) {
        this.sides = sides;
    }
}
