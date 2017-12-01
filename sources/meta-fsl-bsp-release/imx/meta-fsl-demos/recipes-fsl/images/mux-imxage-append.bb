DESCRIPTION = "Muxvision Append Image"
LICENSE = "MIT"


QTMULTIMEDIA_IMAGE_INSTALL = ""
QTMULTIMEDIA_IMAGE_INSTALL_mx6 = " \
		qtmultimedia \
		qtmultimedia-plugins \
		qtmultimedia-examples \
		qtmultimedia-qmlplugins \
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
    python-elementtree \
    python-email \
    python-fcntl \
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

IMAGE_INSTALL += " \
	${QTMULTIMEDIA_IMAGE_INSTALL} \
    ${PYTHON_IMAGE_INSTALL} \
	libpcap \
	ppp \
	hostap-daemon \
	iptables \
	qtserialport \
	mux-video \
	qtsystems \
	nss \
	nspr \
    tcpdump \
    iftop \
    lrzsz \
    zip \
    unzip \
    curl \
"

ROOTFS_POSTPROCESS_COMMAND += "set_root_passwd;"
set_root_passwd() {
   sed 's%^root:[^:]*:%root:\$6\$zZAnqXoUms\/\$UNaow65wq396zQ91LnojoyPeYmdSV2mcxFrNAMLH7SlzSOLOam2i15GxxbbGDkSwcp8qoYisMW2peLSkhHDZQ\/:%' \
	          < ${IMAGE_ROOTFS}/etc/shadow \
			         > ${IMAGE_ROOTFS}/etc/shadow.new;
      mv ${IMAGE_ROOTFS}/etc/shadow.new ${IMAGE_ROOTFS}/etc/shadow ;
}

