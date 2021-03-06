#!/bin/sh

if test -z "$XDG_RUNTIME_DIR"; then
    export XDG_RUNTIME_DIR=/var/run/user/root
    export QT_QPA_PLATFORM=wayland
    mkdir --parents $XDG_RUNTIME_DIR
    chmod 0700 $XDG_RUNTIME_DIR
fi
export FB_MULTI_BUFFER=2
