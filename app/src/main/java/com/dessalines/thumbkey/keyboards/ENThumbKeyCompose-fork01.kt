@file:Suppress("ktlint:standard:no-wildcard-imports")

package com.dessalines.thumbkey.keyboards

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.*
import com.dessalines.thumbkey.utils.*
import com.dessalines.thumbkey.utils.ColorVariant.*
import com.dessalines.thumbkey.utils.FontSizeVariant.*
import com.dessalines.thumbkey.utils.KeyAction.*
import com.dessalines.thumbkey.utils.SwipeNWay.*

val KB_EN_THUMBKEY_COMPOSE_FORK01_MAIN =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("p", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    bottom = KeyC("b"),
                    right = KeyC("f"),
                    left = KeyC("ph"),
                ),
                KeyItemC(
                    center = KeyC("c", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    bottom = KeyC("g"),
                    right = KeyC("ch"),
                    left = KeyC("k"),
                ),
                KeyItemC(
                    center = KeyC("s", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    bottom = KeyC("z"),
                    top = KeyC("j"),
                    right = KeyC("sh"),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("t", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    bottom = KeyC("d"),
                    right = KeyC("th"),
                    left = KeyC("v"),
                ),
                KeyItemC(
                    center = KeyC("n", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    bottom = KeyC("m"),
                    right = KeyC("h"),
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
                ),
                NUMERIC_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("r", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    right = KeyC("l"),
                    left = KeyC("x"),
                ),
                KeyItemC(
                    center = KeyC("i", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    right = KeyC("y"),
                    left = 
                        KeyC("e"),
                ),
                KeyItemC(
                    center = KeyC("a", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    top = KeyC("q"),
                    right = KeyC("e"),
                    left = KeyC("w"),
                ),
                BACKSPACE_KEY_ITEM,
            ),
            listOf(
                SPACEBAR_KEY_ITEM,
                RETURN_KEY_ITEM,
            ),
        ),
    )

val KB_EN_THUMBKEY_COMPOSE_FORK01_SHIFTED =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("P", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    bottom = KeyC("B"),
                    right = KeyC("F"),
                    left = KeyC("PH"),
                ),
                KeyItemC(
                    center = KeyC("C", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    bottom = KeyC("G"),
                    right = KeyC("CH"),
                    left = KeyC("K"),
                ),
                KeyItemC(
                    center = KeyC("S", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    bottom = KeyC("Z"),
                    top = KeyC("J"),
                    right = KeyC("SH"),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("T", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    bottom = KeyC("D"),
                    right = KeyC("TH"),
                    left = KeyC("V"),
                ),
                KeyItemC(
                    center = KeyC("N", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    bottom = KeyC("M"),
                    right = KeyC("H"),
                ),
                KeyItemC(
                    center = KeyC("O", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    bottom = KeyC("U"),
                    left =
                        KeyC(
                            display = KeyDisplay.IconDisplay(Icons.Outlined.ArrowDropDown),
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
                ),
                NUMERIC_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("R", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    right = KeyC("L"),
                    left = KeyC("X"),
                ),
                KeyItemC(
                    center = KeyC("I", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    right = KeyC("Y"),
                    left = 
                        KeyC("E"),
                ),
                KeyItemC(
                    center = KeyC("A", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    top = KeyC("Q"),
                    right = KeyC("E"),
                    left = KeyC("W"),
                ),
                BACKSPACE_KEY_ITEM,
            ),
            listOf(
                SPACEBAR_KEY_ITEM,
                RETURN_KEY_ITEM,
            ),
        ),
    )

val KB_EN_THUMBKEY_COMPOSE_FORK01: KeyboardDefinition =
    KeyboardDefinition(
        title = "english thumb-key compose - fork 01",
        modes =
            KeyboardDefinitionModes(
                main = KB_EN_THUMBKEY_COMPOSE_FORK01_MAIN,
                shifted = KB_EN_THUMBKEY_COMPOSE_FORK01_SHIFTED,
                numeric = NUMERIC_KEYBOARD,
            ),
        settings =
            KeyboardDefinitionSettings(
                autoCapitalizers = arrayOf(::autoCapitalizeI, ::autoCapitalizeIApostrophe),
            ),
    )
