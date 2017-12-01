
SRC_URI = "git://git@github.com:muxvision/linux-mx5a.git;branch=${SRCBRANCH};protocol=ssh \
"
SRCREV="${AUTOREV}"
SRCBRANCH="master"

SCMVERSION = ""
LOCALVERSION = "-generic"

PE = "1"
PR = "r1"

KBUILD_DEFCONFIG ?= "mx5a01_defconfig"
 
do_copy_defconfig() {
    if [ -n "${KBUILD_DEFCONFIG}"  ]; then
        if [ -f "${S}/arch/${ARCH}/configs/${KBUILD_DEFCONFIG}"  ]; then
            cp -f ${S}/arch/${ARCH}/configs/${KBUILD_DEFCONFIG} ${WORKDIR}/defconfig
        fi
    fi
}

