CRIPTION = "Muxvision Image - Adds Qt5"
LICENSE = "MIT"


require recipes-fsl/images/fsl-image-qt5.bb

BBFILES += "${BSPDIR}/sources/meta-openembedded/meta-webserver/"
BBFILES += "${BSPDIR}/sources/meta-openembedded/meta-multimedia/recipes-multimedia/"

PACKAGECONFIG_remove_mx6 = " \
	opencv \
"
IMAGE_INSTALL_remove += " \
        packagegroup-fsl-tools-gpu-external \
        packagegroup-fsl-tools-testapps \
        packagegroup-fsl-tools-benchmark \
"

PYTHON_IMAGE_INSTALL = ""
PYTHON_IMAGE_INSTALL_mx6 = "\
    python-compile \
    python-compiler \
    python-compression \
    python-core \
    python-curses \
    python-datetime \
    python-difflib \
    python-distutils \
    python-git \
    python-json \
    python-logging \
    python-misc \
    python-mmap \
    python-multiprocessing \
    python-netclient \
    python-netserver \
    python-pickle \
    python-pkgutil \
    python-pprint \
    python-re \
    python-rpm \
    python-shell \
    python-sqlite3 \
    python-subprocess \
    python-textutils \
    python-unittest \
    python-unixadmin \
    python-xmlrpc \
    python-distribute \
    python-pip \
    python-dbus \
    "
MXAPP_DEPEND_INSTALL = "\
    udev \
    udev-extraconf \
    fsl-rc-local \
    libpcap \
    ppp \
    iptables \
    tcpdump \
    iftop \
    lrzsz \
    zip \
    unzip \
    curl \
"

IMAGE_INSTALL += " \
    qtmultimedia \
    qtwebkit \
    ${PYTHON_IMAGE_INSTALL} \
    ${MXAPP_DEPEND_INSTALL} \
"
