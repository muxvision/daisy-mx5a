
SUMMARY = "Muxvision append config file"
LICENSE = "MIT"
PR = "r0"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"


SRC_URI = " \
	file://mx6_sys_config.ini.mux \
	file://weston.ini.mux \
	file://localtime.mux \
"

FILES_${PN} = " \
		/media/0/Mux/mx6_sys_config.ini \
		/media/0/Mux/mx6_sys_config.ini.orig \
		/etc/xdg/weston/weston.ini \
		/etc/xdg/weston/weston.ini.orig \
		/etc/localtime \
		"

do_install() {
	mkdir -p ${D}/media/
	mkdir -p  ${D}/media/0/Mux/
    install -D -m 0644 ${WORKDIR}/mx6_sys_config.ini.mux ${D}/media/0/Mux/mx6_sys_config.ini
    install -D -m 0400 ${WORKDIR}/mx6_sys_config.ini.mux ${D}/media/0/Mux/mx6_sys_config.ini.orig

	mkdir -p ${D}${sysconfdir}/xdg/weston/
    install -D -m 0644 ${WORKDIR}/weston.ini.mux ${D}${sysconfdir}/xdg/weston/weston.ini
    install -D -m 0400 ${WORKDIR}/weston.ini.mux ${D}${sysconfdir}/xdg/weston/weston.ini.orig

	install -m 0644 ${WORKDIR}/localtime.mux ${D}${sysconfdir}/localtime
}

