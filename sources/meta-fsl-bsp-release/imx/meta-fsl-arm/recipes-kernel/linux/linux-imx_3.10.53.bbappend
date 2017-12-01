FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}-${PV}:"

# add patches for 3.10.53-1.1.2  - apply only for i.MX 6SX 14x14 lpddr
PATCH_SXLPDDR = " file://0001-MLK-10343-1-ARM-imx-support-low-power-idle-for-i.mx6.patch \
                 file://0002-MLK-10343-2-ARM-imx-DSM-mode-with-MMDC-DDR-IO-for-LP.patch   \
                 file://0003-MLK-10343-3-ARM-dts-imx6sx-add-14x14-lpddr2-board-su.patch"

SRC_URI_append_imx6sx14x14arm2 = "${PATCH_SXLPDDR}"
