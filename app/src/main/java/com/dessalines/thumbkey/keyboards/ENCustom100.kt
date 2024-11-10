@file:Suppress("ktlint:standard:no-wildcard-imports")

package com.dessalines.thumbkey.keyboards

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.*
import com.dessalines.thumbkey.utils.*
import com.dessalines.thumbkey.utils.ColorVariant.*
import com.dessalines.thumbkey.utils.FontSizeVariant.*
import com.dessalines.thumbkey.utils.KeyAction.*
import com.dessalines.thumbkey.utils.SwipeNWay.*

val KB_EN_CUSTOM_100_MAIN =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("p", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    bottom = KeyC("b"),
                    top = KeyC("ff", color = MUTED),
                    right = KeyC("f"),
                    left = KeyC("ph", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("c", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    bottom = KeyC("g"),
                    top = KeyC("gh", color = MUTED),
                    right = KeyC("ch", color = MUTED),
                    left = KeyC("k"),
                ),
                KeyItemC(
                    center = KeyC("s", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    bottom = KeyC("z"),
                    top = KeyC("j", color = MUTED),
                    right = KeyC("sh", color = MUTED),
                    left = KeyC("j"),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("t", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    bottom = KeyC("d"),
                    right = KeyC("th", color = MUTED),
                    left = KeyC("v"),
                ),
                KeyItemC(
                    center = KeyC("n", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    bottom = KeyC("m"),
                    top = KeyC("ng", color = MUTED),
                    right = KeyC("h"),
                    left = KeyC("ng", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("o", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    bottom = KeyC("u"),
                    top =
                        KeyC(
                            display = KeyDisplay.IconDisplay(Icons.Outlined.ArrowDropUp),
                            action = ToggleShiftMode(true),
                            swipeReturnAction = ToggleCurrentWordCapitalization(true),
                            color = MUTED,
                        ),
                    right = KeyC("w", color = MUTED),
                ),
                NUMERIC_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("r", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    bottom = KeyC("x"),
                    top = KeyC("ll", color = MUTED),
                    right = KeyC("l"),
                ),
                KeyItemC(
                    center = KeyC("i", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    bottom = KeyC("y", color = MUTED),
                    top = KeyC("e", color = MUTED),
                    right = KeyC("y"),
                    left = KeyC("e", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("a", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    bottom = KeyC("wh", color = MUTED),
                    top = KeyC("q"),
                    right = KeyC("e"),
                    left = KeyC("w"),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            display = KeyDisplay.TextDisplay("⌫"),
                            action =
                                SendEvent(
                                    KeyEvent(
                                        KeyEvent.ACTION_DOWN,
                                        KeyEvent
                                            .KEYCODE_DEL,
                                    ),
                                ),
                            size = LARGE,
                            color = SECONDARY,
                        ),
                    swipeType = FOUR_WAY_CROSS,
                    right =
                        KeyC(
                            display = KeyDisplay.TextDisplay("⇥"),
                            action = DeleteWordAfterCursor,
                            color = MUTED,
                        ),
                    left =
                        KeyC(
                            display = KeyDisplay.TextDisplay("⇤"),
                            action = DeleteWordBeforeCursor,
                            color = MUTED,
                        ),
                    backgroundColor = SURFACE_VARIANT,
                ),
            ),
            listOf(
                SPACEBAR_KEY_ITEM,
                RETURN_KEY_ITEM,
            ),
        ),
    )

val KB_EN_CUSTOM_100_SHIFTED =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("P", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    bottom = KeyC("B"),
                    top = KeyC("FF", color = MUTED),
                    right = KeyC("F"),
                    left = KeyC("PH", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("C", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    bottom = KeyC("G"),
                    top = KeyC("GH", color = MUTED),
                    right = KeyC("CH", color = MUTED),
                    left = KeyC("K"),
                ),
                KeyItemC(
                    center = KeyC("S", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    bottom = KeyC("Z"),
                    top = KeyC("J", color = MUTED),
                    right = KeyC("SH", color = MUTED),
                    left = KeyC("J"),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("T", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    bottom = KeyC("D"),
                    right = KeyC("TH", color = MUTED),
                    left = KeyC("V"),
                ),
                KeyItemC(
                    center = KeyC("N", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    bottom = KeyC("M"),
                    top = KeyC("NG", color = MUTED),
                    right = KeyC("H"),
                    left = KeyC("NG", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("O", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    bottom = KeyC("U"),
                    left =
                        KeyC(
                            display = KeyDisplay.TextDisplay("⇩"),
                            action = ToggleShiftMode(false),
                            swipeReturnAction = ToggleCurrentWordCapitalization(false),
                            color = MUTED,
                        ),
                    top =
                        KeyC(
                            display = KeyDisplay.IconDisplay(Icons.Outlined.KeyboardCapslock),
                            capsModeDisplay = KeyDisplay.IconDisplay(Icons.Outlined.Copyright),
                            action = ToggleCapsLock,
                            swipeReturnAction = ToggleCurrentWordCapitalization(true),
                            color = MUTED,
                        ),
                    right = KeyC("W", color = MUTED),
                ),
                NUMERIC_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("R", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    bottom = KeyC("X"),
                    top = KeyC("LL", color = MUTED),
                    right = KeyC("L"),
                ),
                KeyItemC(
                    center = KeyC("I", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    bottom = KeyC("Y", color = MUTED),
                    top = KeyC("E", color = MUTED),
                    right = KeyC("Y"),
                    left = KeyC("E", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("A", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    bottom = KeyC("WH", color = MUTED),
                    top = KeyC("Q"),
                    right = KeyC("E"),
                    left = KeyC("W"),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            display = KeyDisplay.TextDisplay("⌫"),
                            action =
                                SendEvent(
                                    KeyEvent(
                                        KeyEvent.ACTION_DOWN,
                                        KeyEvent
                                            .KEYCODE_DEL,
                                    ),
                                ),
                            size = LARGE,
                            color = SECONDARY,
                        ),
                    swipeType = FOUR_WAY_CROSS,
                    right =
                        KeyC(
                            display = KeyDisplay.TextDisplay("⇥"),
                            action = DeleteWordAfterCursor,
                            color = MUTED,
                        ),
                    left =
                        KeyC(
                            display = KeyDisplay.TextDisplay("⇤"),
                            action = DeleteWordBeforeCursor,
                            color = MUTED,
                        ),
                    backgroundColor = SURFACE_VARIANT,
                ),
            ),
            listOf(
                SPACEBAR_KEY_ITEM,
                RETURN_KEY_ITEM,
            ),
        ),
    )

val KB_EN_CUSTOM_100: KeyboardDefinition =
    KeyboardDefinition(
        title = "english custom keyboard - 1-0-0",
        modes =
            KeyboardDefinitionModes(
                main = KB_EN_CUSTOM_100_MAIN,
                shifted = KB_EN_CUSTOM_100_SHIFTED,
                numeric = NUMERIC_KEYBOARD,
            ),
        settings =
            KeyboardDefinitionSettings(
                autoCapitalizers = arrayOf(::autoCapitalizeI, ::autoCapitalizeIApostrophe),
            ),
    )
